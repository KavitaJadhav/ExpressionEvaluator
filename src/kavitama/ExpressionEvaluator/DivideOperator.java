package kavitama.ExpressionEvaluator;

/**
 * It will divide 1st number by second numbers
 */
public class DivideOperator implements Operator {
    @Override
    public double perform(double first, double second) {
        return first / second;
    }
}
