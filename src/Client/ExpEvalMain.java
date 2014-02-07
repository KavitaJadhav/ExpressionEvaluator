package Client;

import kavitama.ExpressionEvaluator.ExpEval;

public class ExpEvalMain {
    public static void main(String[] args) throws Exception {

        System.out.println(new ExpEval(args[0]).evaluateExpression());

    }
}
