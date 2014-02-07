package Client;

import kavitama.ExpressionEvaluator.ExpEval;

public class ExpEvalMain {
    public static void main(String[] args) throws Exception {
        ExpEval expeval = new ExpEval(args[0]);

        double result = expeval.evaluateExpression();

        if(args[0].contains(".") || args[0].contains("/")) System.out.println(result);
        else if(args[0].contains("^") && (result%1 != 0)) System.out.println(result);
        else System.out.println((int)result);
    }
}
