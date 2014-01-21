package Client;

import kavitama.ExpressionEvaluator.ExpEval;

public class ExpEvalMain extends ExpEval {
    public static void main(String[] args) {
        ExpEval expeval = new ExpEval();
        System.out.println(expeval.evaluateExpression(args[0]));
    }
}
