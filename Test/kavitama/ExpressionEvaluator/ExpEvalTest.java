package kavitama.ExpressionEvaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpEvalTest extends ExpEval {
    @Test
    public void evaluateExpressionAddTwoIntNumber() throws Exception {

        double actual = evaluateExpression("4 + 5");
        assertEquals(9.0d , actual,0.01);
    }
    @Test
    public void evaluateExpressionAddTwoNegativeIntNumber() throws Exception {

        double actual = evaluateExpression("-4 + -5");
        assertEquals(-9.0d , actual,0.01);
    }
    @Test
    public void evaluateExpressionAddTwoIntNumber1() throws Exception {

        double actual = evaluateExpression("40 + 50");
        assertEquals(90d , actual,0.01);
    }
    @Test
    public void evaluateExpressionSubstractTwoIntNumber() throws Exception {

        double actual = (double)evaluateExpression("10 - 5");
        assertEquals(5d , actual,0.01);
    }
    @Test
    public void evaluateExpressionSubstractTwoNegativeIntNumber() throws Exception {

        double actual = (double)evaluateExpression("10 - -5");

        assertEquals(15d, actual,0.01);
    }
    @Test
    public void evaluateExpressionMultiplyTwoIntNumber() throws Exception {

        double actual = evaluateExpression("10 * 5");

        assertEquals((double) 50, actual,0.01);
    }
    @Test
    public void evaluateExpressionMultiplyTwoNegativeIntNumber() throws Exception {

        double actual = evaluateExpression("-10 * 5");

        assertEquals((double) -50, actual,0.01);
    }
    @Test
    public void evaluateExpressionDivideTwoIntNumber() throws Exception {

        double actual = evaluateExpression("22 / 7");

        assertEquals((double) 3.142857f, actual,0.01);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber() throws Exception {
        double expected = 100000;

        double actual = evaluateExpression("10 ^ 5");

        assertEquals(expected , actual,0.01);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber1() throws Exception {
        long expected = 4294967296l ;

        long actual =(long) evaluateExpression("2 ^ 32");

        assertEquals(expected , actual,0.01);
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

        double actual = evaluateExpression("-10 / 5");

        assertEquals((double) -2, actual,0.01);
    }
    @Test
    public void evaluateExpressionAddTwoFloatNumber() throws Exception {

        double actual = evaluateExpression("4.5 + 5.8");

        assertEquals((double) 10.3,actual,0.01);
    }
    @Test
    public void evaluateExpressionSubstractTwoFloatNumber() throws Exception {

        double actual = evaluateExpression("4.5 - 5.8");

        assertEquals((double) -1.3,actual,0.01);
    }
    @Test
    public void evaluateExpressionMultiplyTwoFloatNumber() throws Exception {
        double expected = 26.1f;

        double actual = evaluateExpression("4.5 * 5.8");

        assertEquals(expected ,actual,0.01);
    }
    @Test
    public void evaluateExpressionDivideTwoFloatNumber() throws Exception {
        double expected = 0.7758621f;

        double actual = evaluateExpression("4.5 / 5.8");

        assertEquals(expected ,actual,0.01);
    }
    @Test
    public void evaluateExpressionPowerTwoFloatNumber() throws Exception {

        double actual = evaluateExpression("-4.5 ^ 2");

        assertEquals((double) 20.25,actual,0.01);
    }
    @Test
    public void evaluateExpressionNegativePowerTwoFloatNumber() throws Exception {

        double actual = evaluateExpression("2.0 ^ -3");

        assertEquals((double) 0.125,actual,0.01);
    }
    @Test
    public void evaluateExpressionMultipleIntOperands() throws Exception {

        double actual = evaluateExpression("10 - -5 * 2 / 10");

        assertEquals((double) 3, actual,0.01);
    }
    @Test
    public void evaluateExpressionMultipleFloatOperands() throws Exception {

        double actual = evaluateExpression("10.5 + 5.5 / 2.0 ^ 2 - 50");

        assertEquals((double) 14, actual,0.01);
    }
    @Test
    public void testHandleBrackets() throws Exception {
        String expected = "10 - 10.0 + 5";

        String  actual = handleBrackets("10 - (5 * 2) + 5");

        assertEquals(expected , actual);
    }
    @Test
    public void HandleSimpleBracketWithIntOperands() throws Exception {

        double actual = evaluateExpression("10 - (5 * 2) + 5");

        assertEquals((double) 5, actual,0.01);
    }
    @Test
    public void HandleSimpleBracketWithFloatBrackets() throws Exception {

        double actual = evaluateExpression("10.5 - (5 * 2.5) + 5");

        assertEquals((double) 3, actual,0.01);
    }
    @Test
    public void HandleSimpleBracketWithIntOperands1() throws Exception {

        double actual = evaluateExpression("10 - (5 * 2) + 5 + (4 * 2) - (2.5 * 1.5)");

        assertEquals((double) 9.25, actual,0.01);
    }
    @Test
    public void HandleNestedBracketWithIntOperands() throws Exception {

        double actual = evaluateExpression("10 - ((5 * 2) + 5)");

        assertEquals((double) -5, actual,0.01);
    }
    @Test
    public void HandleNestedBracketWithFloatOperands() throws Exception {
        double actual = evaluateExpression("10.5 + ((5 * 2) + 0.5) ^ 2");

        assertEquals((double) 441, actual,0.01);
    }

    @Test
    public void Expressionwithoutspace() throws Exception {

        double actual = evaluateExpression("10-5*2+5");

        assertEquals((double) 15, actual,0.01);
    }
    @Test
    public void ExpressionwithoutspaceNegativeNumbers() throws Exception {

        double actual = evaluateExpression("10--5*2+5");

        assertEquals((double) 35, actual,0.01);
    }
    @Test
    public void ExpressionWithoutSpaceBrackets() throws Exception {

        double actual = evaluateExpression("10-(5*2)+5");

        assertEquals((double) 5, actual,0.01);
    }
    @Test
    public void ExpressionWithoutSpaceBracketWithNegative() throws Exception {

        double actual = evaluateExpression("10-(-5.0*2.5)+5");

        assertEquals((double) 27.5f, actual,0.01);
    }
    @Test
    public void ExpressionWithoutSpaceNestedBracket() throws Exception {
        double actual = evaluateExpression("(10*(-5-2))+5");

        assertEquals(-65d , actual,0.01);
    }
    @Test
    public void ExpressionWithTwoMinus() throws Exception {

        double actual = evaluateExpression("2.25 -- 0.25");

        assertEquals((double) 2.50f, actual,0.01);
    }
    @Test
    public void ExpressionWithOneOperand() throws Exception {

        double actual = evaluateExpression("-(-10)");

        assertEquals(10d, actual,0.01);
    }

    @Test (expected = Exception.class)
    public void ExpressionWithMultiplicationOperatorAndOneOperand() throws Exception {

        evaluateExpression("*10");
    }
}

