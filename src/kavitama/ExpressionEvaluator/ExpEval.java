
package kavitama.ExpressionEvaluator;

import java.util.ArrayList;
import java.util.List;

public class ExpEval extends Operations {
    public boolean isOperator(String element){
        return (element.contains("+") || element.endsWith("-") || element.contains("*") || element.contains("/")|| element.contains("^"));
    }
    public double performOperation(List<Character> operators , List<Double> operands ){
        double result = operands.get(0);
        int i=1;
        for (Character operator : operators) {
            switch (operator){
                case '+':
                    if(operands.size() == 1) return operands.get(0);
                    result = add(result ,operands.get(i++));
                    break;
                case '-':
                    if(operands.size() == 1) return operands.get(0);
                    result = substract(result ,operands.get(i++));
                    break;
                case '*':
                    result = multiply(result, operands.get(i++));
                    break;
                case '/':
                    result = divide(result, operands.get(i++));
                    break;
                case '^':
                    result = power(result, operands.get(i++));
                    break;
            }
        }
        return result;
    }

    public String handleBrackets(String expression) throws Exception {
        int startIndex = 0 ,endIndex = 0;
        for (int i = 0; i < expression.length() ; i++) {
            if(expression.charAt(i) == '(') startIndex = i;
            if(expression.charAt(i) == ')') {
                endIndex = i;
                break;
            }
        }
        String subExp = expression.substring(startIndex , endIndex+1);
        String result = "";
        result+= evaluateExpression(subExp.substring(1 ,subExp.length()-1));
        return expression.replace(subExp, result);
    }
    public String replaceWithSpace(String expression){
        return expression.trim()
            .replaceAll("\\--", "+")
            .replaceAll("\\+", " + ")
            .replaceAll("\\-"," - ")
            .replaceAll("\\*"," * ")
            .replaceAll("\\/"," / ")
            .replaceAll("\\^"," ^ ")
            .replaceAll("  - "," -")
            .replaceAll("^ - ", "-")
            .replaceAll(" +"," ")
            .replaceAll("\\( - ","(-")
            .trim();
    }
    public double evaluateExpression(String expression) throws Exception {
        List<Double> operands = new ArrayList();
        List<Character> operators = new ArrayList();

        expression = replaceWithSpace(expression);
        while (expression.contains("("))    expression = handleBrackets(expression);
        expression = replaceWithSpace(expression);

        String[] elements = expression.split(" ");
        if(isOperator(elements[elements.length-1])) throw new Exception("Wrong expression...");
            for (int i = 0; i <elements.length; i++) {
                if(isOperator(elements[i])) operators.add(elements[i].charAt(0));
                else
                    operands.add(Double.parseDouble(elements[i])) ;
            }
        return performOperation(operators ,operands);
    }
}
