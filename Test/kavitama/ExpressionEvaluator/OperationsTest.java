package kavitama.ExpressionEvaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OperationsTest extends Operations {
    @Test
    public void addWillAddTwodoubleNumber() throws Exception {
        double num1 = 10 ,num2 =20;
        double expected = 30.0;

        double actual = add(num1, num2);

        assertEquals(actual ,expected);
    }
    @Test
    public void SubstractTwoIntNumber() throws Exception {
        double num1 = 10 ,num2 =20;
        double expected = -10.0;

        double actual = substract(num1, num2);

        assertEquals(actual ,expected);
    }

    @Test
    public void MultiplyTwoIntNumber() throws Exception {
        double num1 = 10 ,num2 =20;
        double expected = 200.0;

        double actual = multiply(num1, num2);

        assertEquals(actual ,expected);
    }
    @Test
    public void divideTwoIntNumber() throws Exception {
        double num1 = 20 ,num2 =10;
        double expected = 2.0;

        double actual = divide(num1, num2);

        assertEquals(actual ,expected);
    }

    @Test
    public void getPowerOfIntNumber() throws Exception {
        double num1 = 2 ,num2 =32;
        long expected = 4294967296l ;

        long actual = (long)power(num1, num2);

        assertEquals(expected , actual);
    }
}
