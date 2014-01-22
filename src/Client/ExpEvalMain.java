package Client;

import kavitama.ExpressionEvaluator.ExpEval;

public class ExpEvalMain extends ExpEval {
    public static void main(String[] args) {
        ExpEval expeval = new ExpEval();

        if(args[0].contains("/"))
             System.out.println(expeval.evaluateExpression(args[0]));
        else
            System.out.println((int)expeval.evaluateExpression(args[0]));
    }
}
