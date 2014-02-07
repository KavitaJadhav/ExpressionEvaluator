package kavitama.ExpressionEvaluator;

/**
 * It will multiply two numbers
 */
public class MultiplyOperator implements Operator {
    @Override
    public double perform(double first, double second) {
        return first * second;
    }
}
