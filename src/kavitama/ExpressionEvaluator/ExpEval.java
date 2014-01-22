
package kavitama.ExpressionEvaluator;

import java.util.ArrayList;
import java.util.List;

public class ExpEval {
    public  float add(float num1 ,float num2){
        return num1 + num2;
    }
    public  float substract(float num1 ,float num2){
        return num1 - num2;
    }
    public  float multiply(float num1 ,float num2){
        return num1 * num2;
    }
    public  float divide(float num1 ,float num2){
        float result = num1 / num2;
        result = result * 100;
        result = Math.round(result);
        result = result / 100;
        return  result;
    }
    public double power(float num1, float num2){
        return Math.pow(num1 ,num2);
    }
    public boolean isOperator(String element){
        return (element.contains("+") || element.endsWith("-") || element.contains("*") || element.contains("/")|| element.contains("^"));
    }

    public double performOperation(List<String> operators , List<Float> operands){
        if(operators.get(0).equals("-")) return (int)substract(operands.get(0) ,operands.get(1));
        else if(operators.get(0).equals("*")) return (int)multiply(operands.get(0), operands.get(1));
        else if(operators.get(0).equals("/")) return divide(operands.get(0), operands.get(1));
        else if(operators.get(0).equals("^")) return power(operands.get(0), operands.get(1));
        return (int)add(operands.get(0) ,operands.get(1));
    }

    public double evaluateExpression(String expression){
        String[] elements = expression.split(" ");
        List<Float> operands = new ArrayList();
        List<String> operators = new ArrayList();

        for (int i = 0; i <elements.length; i++) {
            if(isOperator(elements[i])) operators.add(elements[i]);
            else
                operands.add(Float.parseFloat(elements[i])) ;
        }

        return performOperation(operators ,operands);
    }
}
