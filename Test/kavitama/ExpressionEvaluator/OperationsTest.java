package kavitama.ExpressionEvaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OperationsTest extends Operations {
    @Test
    public void addWillAddTwoFloatNumber() throws Exception {
        float num1 = 10 ,num2 =20;
        float expected = (float) 30.0;

        float actual = add(num1, num2);

        assertEquals(actual ,expected);
    }
    @Test
    public void SubstractTwoIntNumber() throws Exception {
        float num1 = 10 ,num2 =20;
        float expected = (float) -10.0;

        float actual = substract(num1, num2);

        assertEquals(actual ,expected);
    }

    @Test
    public void MultiplyTwoIntNumber() throws Exception {
        float num1 = 10 ,num2 =20;
        float expected = (float) 200.0;

        float actual = multiply(num1, num2);

        assertEquals(actual ,expected);
    }
    @Test
    public void divideTwoIntNumber() throws Exception {
        float num1 = 20 ,num2 =10;
        float expected = (float) 2.0;

        float actual = divide(num1, num2);

        assertEquals(actual ,expected);
    }
    @Test
    public void getPowerOfIntNumber() throws Exception {
        float num1 = 2 ,num2 =32;
        long expected = 4294967296l ;

        long actual = (long)power(num1, num2);

        assertEquals(expected , actual);
    }

}
