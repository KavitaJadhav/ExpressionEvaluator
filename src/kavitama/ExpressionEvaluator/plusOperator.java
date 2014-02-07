package kavitama.ExpressionEvaluator;

/**
 * It will add two numbers
 */
public class PlusOperator implements Operator {

    @Override
    public double perform(double first, double second) {
        return first + second;
    }
}
