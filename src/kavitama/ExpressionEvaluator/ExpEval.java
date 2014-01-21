
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
    public int evaluateExpression(String expression){
        String[] elements = expression.split(" ");
        List<Float> operands = new ArrayList();
        List<String> operators = new ArrayList();

        for (int i = 0; i <elements.length; i++) {
            if(elements[i].contains("+") || elements[i].contains("-")) operators.add(elements[i]);
            else {
                operands.add(Float.parseFloat(elements[i])) ;
            }
        }
        if(operators.get(0).equals("-")) return (int)substract(operands.get(0) ,operands.get(1));
        return (int)add(operands.get(0) ,operands.get(1));
    }
}
