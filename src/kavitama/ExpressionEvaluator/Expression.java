package kavitama.ExpressionEvaluator;

/**
 *Contain an expression
 */

public class Expression {
    private Double left;
    private Double right;
    private Operator operator;

    public Expression(Double left, Double right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public double evaluate() {
        return operator.perform(left,right);
    }
}
