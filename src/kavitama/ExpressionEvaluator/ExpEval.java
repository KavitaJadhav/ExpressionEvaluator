
package kavitama.ExpressionEvaluator;

import java.util.*;

public class ExpEval {
    public boolean isOperator(String element){
        return (element.contains("+") || element.endsWith("-") || element.contains("*") || element.contains("/")|| element.contains("^"));
    }

    public double performOperation(List<Operator> operators , List<Double> operands ){
        double result = operands.get(0);
        int i=1;
        if (operands.size() == 1 && ( operators.size() == 0 ||
                Arrays.asList(PlusOperator.class,MinusOperator.class).
                        contains(operators.get(0).getClass())))
            return operands.get(0);
        for (Operator operator : operators){
            result = operator.perform(result,operands.get(i++));
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
        List<Operator> operators = new ArrayList();

        expression = replaceWithSpace(expression);
        while (expression.contains("("))    expression = handleBrackets(expression);
        expression = replaceWithSpace(expression);

        String[] elements = expression.split(" ");
        if(isOperator(elements[elements.length-1])) throw new Exception("Wrong expression...");
            for (int i = 0; i <elements.length; i++) {
                if(isOperator(elements[i])) operators.add(getOperator(elements[i]));
                else
                    operands.add(Double.parseDouble(elements[i])) ;
            }
        return performOperation(operators ,operands);
    }

    private Operator getOperator(String element) {
        Map<String , Operator> operatorMap = new HashMap<String, Operator>();
        operatorMap.put("+",new PlusOperator());
        operatorMap.put("-",new MinusOperator());
        operatorMap.put("*",new MultiplyOperator());
        operatorMap.put("/",new DivideOperator());
        operatorMap.put("^",new ExclusiveOperator());

        return operatorMap.get(element);
    }
}
