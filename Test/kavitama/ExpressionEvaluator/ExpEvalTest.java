package kavitama.ExpressionEvaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpEvalTest extends ExpEval {
    @Test
    public void evaluateExpressionAddTwoIntNumber() throws Exception {
        String expression = "4 + 5";
        float expected = 9;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoNegativeIntNumber() throws Exception {
        String expression = "-4 + -5";
        float expected = -9;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoIntNumber1() throws Exception {
        String expression = "40 + 50";
        float expected = 90;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionSubstractTwoIntNumber() throws Exception {
        String expression = "10 - 5";
        float expected = 5;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionSubstractTwoNegativeIntNumber() throws Exception {
        String expression = "10 - -5";
        float expected = 15;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionMultiplyTwoIntNumber() throws Exception {
        String expression = "10 * 5";
        float expected = 50;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionMultiplyTwoNegativeIntNumber() throws Exception {
        String expression = "-10 * 5";
        float expected = -50;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionDivideTwoIntNumber() throws Exception {
        String expression = "22 / 7";
        float expected = 3.14f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber() throws Exception {
        String expression = "10 ^ 5";
        double expected = 100000;

        double actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber1() throws Exception {
        String expression = "2 ^ 32";
        long expected = 4294967296l ;

        long actual =(long) evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void checkIsOperator() throws Exception {
        String[] operators = {"+" ,"-" ,"*" ,"/"};
        boolean expected = true;

        for (String operator : operators) {
            boolean actual = isOperator(operator);
            assertEquals(actual ,expected);
        }
    }
    @Test
    public void evaluateExpressionDivideTwoNegativeIntNumber() throws Exception {
        String expression = "-10 / 5";
        float expected = -2;

        float actual = (float)evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoFloatNumber() throws Exception {
        String expression = "4.5 + 5.8";
        float expected = 10.3f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected ,actual);
    }
    @Test
    public void evaluateExpressionSubstractTwoFloatNumber() throws Exception {
        String expression = "4.5 - 5.8";
        float expected = -1.3f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected ,actual);
    }
    @Test
    public void evaluateExpressionMultiplyTwoFloatNumber() throws Exception {
        String expression = "4.5 * 5.8";
        float expected = 26.1f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected ,actual);
    }
    @Test
    public void evaluateExpressionDivideTwoFloatNumber() throws Exception {
        String expression = "4.5 / 5.8";
        float expected = 0.78f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected ,actual);
    }
    @Test
    public void evaluateExpressionPowerTwoFloatNumber() throws Exception {
        String expression = "-4.5 ^ 2";
        float expected = 20.25f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected ,actual);
    }
    @Test
    public void evaluateExpressionNegativePowerTwoFloatNumber() throws Exception {
        String expression = "2.0 ^ -3";
        float expected = 0.125f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected ,actual);
    }
}
