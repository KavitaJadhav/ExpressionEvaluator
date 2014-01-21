package kavitama.ExpressionEvaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpEvalTest extends ExpEval {
    @Test
    public void addWillAddTwoFloatNumber() throws Exception {
        float num1 = 10 ,num2 =20;
        float expected = (float) 30.0;

        float actual = add(num1, num2);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoIntNumber() throws Exception {
        String expression = "4 + 5";
        int expected = 9;

        int actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoIntNumber1() throws Exception {
        String expression = "40 + 50";
        int expected = 90;

        int actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }

    @Test
    public void SubstractTwoIntNumber() throws Exception {
        float num1 = 10 ,num2 =20;
        float expected = (float) 30.0;

        float actual = substract(num1, num2);

        assertEquals(actual ,expected);
    }@Test
    public void evaluateExpressionSubstractTwoIntNumber() throws Exception {
        String expression = "10 - 5";
        int expected = 5;

        int actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }

}
