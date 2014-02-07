package kavitama.ExpressionEvaluator;

/**
 * It will subtract two numbers
 */
public class MinusOperator implements Operator {
    @Override
    public double perform(double first, double second) {
        return first - second;
    }
}
