package kavitama.ExpressionEvaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    final Expression left = new Expression(1d);
    final Expression right = new Expression(2d);

    @Test
    public void shouldAddTwoNumber() throws Exception {
        assertEquals(3d,new Expression(left, right,new PlusOperator()).evaluate());
    }
    @Test
    public void shouldSubtractTwoNumber() throws Exception {
        assertEquals(-1d,new Expression(left, right,new MinusOperator()).evaluate());
    }
    @Test
    public void shouldMultiplyTwoNumber() throws Exception {
        assertEquals(2d,new Expression(left, right,new MultiplyOperator()).evaluate());
    }
    @Test
    public void shouldDivideTwoNumber() throws Exception {
        assertEquals(0.5d,new Expression(left, right,new DivideOperator()).evaluate());
    }
}
