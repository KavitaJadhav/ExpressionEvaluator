package kavitama.ExpressionEvaluator;

/**
 * It will calculate exponential from two numbers
 */
public class ExclusiveOperator implements Operator {
    @Override
    public double perform(double first, double second) {
        return Math.pow(first, second);
    }
}
