package kavitama.ExpressionEvaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void shouldAddTwoNumber() throws Exception {
        assertEquals(3d,new Expression(1d,2d,new PlusOperator()).evaluate());
    }
    @Test
    public void shouldSubtractTwoNumber() throws Exception {
        assertEquals(-1d,new Expression(1d,2d,new MinusOperator()).evaluate());
    }
    @Test
    public void shouldMultiplyTwoNumber() throws Exception {
        assertEquals(2d,new Expression(1d,2d,new MultiplyOperator()).evaluate());
    }
    @Test
    public void shouldDivideTwoNumber() throws Exception {
        assertEquals(0.5d,new Expression(1d,2d,new DivideOperator()).evaluate());
    }
}
