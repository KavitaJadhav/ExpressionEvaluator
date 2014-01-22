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
        float expected = 9;

        float actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoNegativeIntNumber() throws Exception {
        String expression = "-4 + -5";
        float expected = -9;

        float actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionAddTwoIntNumber1() throws Exception {
        String expression = "40 + 50";
        float expected = 90;

        float actual = evaluateExpression(expression);

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
    public void evaluateExpressionSubstractTwoIntNumber() throws Exception {
        String expression = "10 - 5";
        float expected = 5;

        float actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionSubstractTwoNegativeIntNumber() throws Exception {
        String expression = "10 - -5";
        float expected = 15;

        float actual = evaluateExpression(expression);

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
    public void evaluateExpressionMultiplyTwoIntNumber() throws Exception {
        String expression = "10 * 5";
        float expected = 50;

        float actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void evaluateExpressionMultiplyTwoNegativeIntNumber() throws Exception {
        String expression = "-10 * 5";
        float expected = -50;

        float actual = evaluateExpression(expression);

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
    public void evaluateExpressionDivideTwoIntNumber() throws Exception {
        String expression = "22 / 7";
        float expected = 3.14f;

        float actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }

    @Test
    public void evaluateExpressionDivideTwoNegativeIntNumber() throws Exception {
        String expression = "-10 / 5";
        float expected = -2;

        float actual = evaluateExpression(expression);

        assertEquals(actual ,expected);
    }
    @Test
    public void checkIsOperator() throws Exception {
        String expression = "10 / 5";
        String[] operators = {"+" ,"-" ,"*" ,"/"};
        boolean expected = true;

        for (String operator : operators) {
            boolean actual = isOperator(operator);
            assertEquals(actual ,expected);
        }
    }
}
