package kavitama.ExpressionEvaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpEvalTest extends ExpEval {
    @Test
    public void evaluateExpressionAddTwoIntNumber() throws Exception {
        String expression = "4 + 5";
        float expected = 9;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionAddTwoNegativeIntNumber() throws Exception {
        String expression = "-4 + -5";
        float expected = -9;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionAddTwoIntNumber1() throws Exception {
        String expression = "40 + 50";
        float expected = 90;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionSubstractTwoIntNumber() throws Exception {
        String expression = "10 - 5";
        float expected = 5;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionSubstractTwoNegativeIntNumber() throws Exception {
        String expression = "10 - -5";
        float expected = 15;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionMultiplyTwoIntNumber() throws Exception {
        String expression = "10 * 5";
        float expected = 50;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionMultiplyTwoNegativeIntNumber() throws Exception {
        String expression = "-10 * 5";
        float expected = -50;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionDivideTwoIntNumber() throws Exception {
        String expression = "22 / 7";
        float expected = 3.142857f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber() throws Exception {
        String expression = "10 ^ 5";
        double expected = 100000;

        double actual = evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber1() throws Exception {
        String expression = "2 ^ 32";
        long expected = 4294967296l ;

        long actual =(long) evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void checkIsOperator() throws Exception {
        String[] operators = {"+" ,"-" ,"*" ,"/"};
        boolean expected = true;

        for (String operator : operators) {
            boolean actual = isOperator(operator);
            assertEquals(expected , actual);
        }
    }
    @Test
    public void evaluateExpressionDivideTwoNegativeIntNumber() throws Exception {
        String expression = "-10 / 5";
        float expected = -2;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
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
        float expected = -1.3000002f;

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
        float expected = 0.77586204f;

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
    @Test
    public void evaluateExpressionMultipleIntOperands() throws Exception {
        String expression = "10 - -5 * 2 / 10";
        float expected = 3;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void evaluateExpressionMultipleFloatOperands() throws Exception {
        String expression = "10.5 + 5.5 / 2.0 ^ 2 - 50";
        float expected = 14;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void testHandleBrackets() throws Exception {
        String expression = "10 - (5 * 2) + 5";
        String expected = "10 - 10.0 + 5";

        String  actual = handleBrackets(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void HandleSimpleBracketWithIntOperands() throws Exception {
        String expression = "10 - (5 * 2) + 5";
        float expected = 5;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void HandleSimpleBracketWithFloatBrackets() throws Exception {
        String expression = "10.5 - (5 * 2.5) + 5";
        float expected = 3;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void HandleSimpleBracketWithIntOperands1() throws Exception {
        String expression = "10 - (5 * 2) + 5 + (4 * 2) - (2.5 * 1.5)";
        float expected = 9.25f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void HandleNestedBracketWithIntOperands() throws Exception {
        String expression = "10 - ((5 * 2) + 5)";
        float expected = -5;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void HandleNestedBracketWithFloatOperands() throws Exception {
        String expression = "10.5 + ((5 * 2) + 0.5) ^ 2";
        float expected = 441;
        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }

    @Test
    public void Expressionwithoutspace() throws Exception {
        String expression = "10-5*2+5";
        float expected = 15;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void ExpressionwithoutspaceNegativeNumbers() throws Exception {
        String expression = "10--5*2+5";
        float expected = 35;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void Expressionwithoutspacebrackets() throws Exception {
        String expression = "10-(5*2)+5";
        float expected = 5;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void ExpressionwithoutspaceBracketwithNegative() throws Exception {
        String expression = "10-(-5.0*2.5)+5";
        float expected = 27.5f;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void ExpressionwithoutspaceNestedBracket() throws Exception {
        String expression = "(10*(-5-2))+5";
        float expected = -65;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
    @Test
    public void Expressionwithoneoperand() throws Exception {
        String expression = "-(-10)";
        float expected = 10;

        float actual = (float)evaluateExpression(expression);

        assertEquals(expected , actual);
    }
}

