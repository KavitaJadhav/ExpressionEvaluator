package kavitama.ExpressionEvaluator;

/**
 *Contain an expression
 */

public class Expression {
    private Double value;
    private Expression left;
    private Expression right;
    private Operator operator;

    public Expression(Expression left, Expression right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression(double value) {
        this.value = value;
    }

    public Double evaluate() {
        return value == null ? operator.perform(left.evaluate(),right.evaluate()) : value;
    }

}
