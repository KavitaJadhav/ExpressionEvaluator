
package kavitama.ExpressionEvaluator;

import java.util.ArrayList;
import java.util.List;

class Operations{
    public float RoundUptoThreeDecimalPoint(float number){
        float result = number * 1000;
        result = Math.round(result);
        return result / 1000;
    }
    public  float add(float num1 ,float num2){
        return RoundUptoThreeDecimalPoint((num1 + num2));
    }
    public  float substract(float num1 ,float num2){
        return RoundUptoThreeDecimalPoint((num1 - num2));
    }
    public  float multiply(float num1 ,float num2){
        return RoundUptoThreeDecimalPoint((num1 * num2));
    }
    public  float divide(float num1 ,float num2){
        float result = (num1 / num2) * 100;
        result = Math.round(result);
        return result / 100;
    }
    public double power(float num1, float num2){
        return Math.pow(num1 ,num2);
    }
}
public class ExpEval extends Operations {
    public boolean isOperatorchar(char element){
        return (element == '+' || element == '-' || element == '*' || element == '/' || element == '^');
    }
    public boolean isOperator(String element){
        return (element.contains("+") || element.endsWith("-") || element.contains("*") || element.contains("/")|| element.contains("^"));
    }
    public float performOperation(List<String> operators , List<Float> operands){
        float result = operands.get(0);
        int i=1;
        for (String operator : operators) {
            switch (operator.charAt(0)){
                case '+':
                    result = add(result ,operands.get(i++));
                    break;
                case '-':
                    result = substract(result ,operands.get(i++));
                    break;
                case '*':
                    result = multiply(result, operands.get(i++));
                    break;
                case '/':
                    result = divide(result, operands.get(i++));
                    break;
                case '^':
                    result = (float)power(result, operands.get(i++));
                    break;
            }
        }
        return result;
    }

    public String handleBrackets(String expression){
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

    public double evaluateExpression(String expression){
        List<Float> operands = new ArrayList();
        List<String> operators = new ArrayList();

        while (expression.contains("("))    expression = handleBrackets(expression);

            String[] elements = expression.split(" ");
            for (int i = 0; i <elements.length; i++) {
                if(isOperator(elements[i])) operators.add(elements[i]);
                else
                    operands.add(Float.parseFloat(elements[i])) ;
            }
        return performOperation(operators ,operands);
    }
}
