package Client;

import kavitama.ExpressionEvaluator.Parser;

public class ExpEvalMain {
    public static void main(String[] args) throws Exception {

        System.out.println(new Parser(args[0]).evaluateExpression());

    }
}
