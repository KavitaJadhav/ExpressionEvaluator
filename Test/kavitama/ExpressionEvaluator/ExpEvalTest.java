package kavitama.ExpressionEvaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpEvalTest {
    @Test
    public void evaluateExpressionAddTwoIntNumber() throws Exception {

        double actual = new ExpEval("4 + 5").evaluateExpression();
        assertEquals(9.0d , actual,0.01);
    }
    @Test
    public void evaluateExpressionAddTwoNegativeIntNumber() throws Exception {

        double actual = new ExpEval("-4 + -5").evaluateExpression();
        assertEquals(-9.0d , actual,0.01);
    }
    @Test
    public void evaluateExpressionSubstractTwoIntNumber() throws Exception {

        double actual = new ExpEval("10 - 5").evaluateExpression();
        assertEquals(5d , actual,0.01);
    }

    @Test
    public void evaluateExpressionSubstractTwoNegativeIntNumber() throws Exception {

        double actual = (double)new ExpEval("10 - -5").evaluateExpression();

        assertEquals(15d, actual,0.01);
    }
    @Test
    public void evaluateExpressionMultiplyTwoIntNumber() throws Exception {

        double actual = new ExpEval("10 * 5").evaluateExpression();

        assertEquals((double) 50, actual,0.01);
    }
    @Test
    public void evaluateExpressionMultiplyTwoNegativeIntNumber() throws Exception {

        double actual = new ExpEval("-10 * 5").evaluateExpression();

        assertEquals((double) -50, actual,0.01);
    }
    @Test
    public void evaluateExpressionDivideTwoIntNumber() throws Exception {

        double actual = new ExpEval("22 / 7").evaluateExpression();

        assertEquals((double) 3.142857f, actual,0.01);
    }
    @Test
    public void evaluateExpressionTogetPowerOfIntNumber() throws Exception {
        double expected = 100000;

        double actual = new ExpEval("10 ^ 5").evaluateExpression();

        assertEquals(expected , actual,0.01);
    }
    @Test
    public void evaluateExpressionToGetPowerOfIntNumber1() throws Exception {
        long expected = 4294967296l ;

        long actual =(long) new ExpEval("2 ^ 32").evaluateExpression();

        assertEquals(expected , actual,0.01);
    }
    @Test
    public void evaluateExpressionDivideTwoNegativeIntNumber() throws Exception {

        double actual = new ExpEval("-10 / 5").evaluateExpression();

        assertEquals((double) -2, actual,0.01);
    }
    @Test
    public void evaluateExpressionAddTwoFloatNumber() throws Exception {

        double actual = new ExpEval("4.5 + 5.8").evaluateExpression();

        assertEquals((double) 10.3,actual,0.01);
    }
    @Test
    public void evaluateExpressionSubstractTwoFloatNumber() throws Exception {

        double actual = new ExpEval("4.5 - 5.8").evaluateExpression();

        assertEquals((double) -1.3,actual,0.01);
    }
    @Test
    public void evaluateExpressionMultiplyTwoFloatNumber() throws Exception {
        double expected = 26.1f;

        double actual = new ExpEval("4.5 * 5.8").evaluateExpression();

        assertEquals(expected ,actual,0.01);
    }
    @Test
    public void evaluateExpressionDivideTwoFloatNumber() throws Exception {
        double expected = 0.7758621f;

        double actual = new ExpEval("4.5 / 5.8").evaluateExpression();

        assertEquals(expected ,actual,0.01);
    }
    @Test
    public void evaluateExpressionPowerTwoFloatNumber() throws Exception {

        double actual = new ExpEval("-4.5 ^ 2").evaluateExpression();

        assertEquals((double) 20.25,actual,0.01);
    }
    @Test
    public void evaluateExpressionNegativePowerTwoFloatNumber() throws Exception {

        double actual = new ExpEval("2.0 ^ -3").evaluateExpression();

        assertEquals((double) 0.125,actual,0.01);
    }
    @Test
    public void evaluateExpressionMultipleIntOperands() throws Exception {

        double actual = new ExpEval("10 - -5 * 2 / 10").evaluateExpression();

        assertEquals((double) 3, actual,0.01);
    }
    @Test
    public void evaluateExpressionMultipleFloatOperands() throws Exception {

        double actual = new ExpEval("10.5 + 5.5 / 2.0 ^ 2 - 50").evaluateExpression();

        assertEquals((double) 14, actual,0.01);
    }
    @Test
    public void HandleSimpleBracketWithIntOperands() throws Exception {

        double actual = new ExpEval("10 - (5 * 2) + 5").evaluateExpression();

        assertEquals((double) 5, actual,0.01);
    }
    @Test
    public void HandleSimpleBracketWithFloatBrackets() throws Exception {

        double actual = new ExpEval("10.5 - (5 * 2.5) + 5").evaluateExpression();

        assertEquals((double) 3, actual,0.01);
    }
    @Test
    public void HandleSimpleBracketWithIntOperands1() throws Exception {

        double actual = new ExpEval("10 - (5 * 2) + 5 + (4 * 2) - (2.5 * 1.5)").evaluateExpression();

        assertEquals((double) 9.25, actual,0.01);
    }
    @Test
    public void HandleNestedBracketWithIntOperands() throws Exception {

        double actual = new ExpEval("10 - ((5 * 2) + 5)").evaluateExpression();

        assertEquals((double) -5, actual,0.01);
    }
    @Test
    public void HandleNestedBracketWithFloatOperands() throws Exception {
        double actual = new ExpEval("10.5 + ((5 * 2) + 0.5) ^ 2").evaluateExpression();

        assertEquals((double) 441, actual,0.01);
    }

    @Test
    public void Expressionwithoutspace() throws Exception {

        double actual = new ExpEval("10-5*2+5").evaluateExpression();

        assertEquals((double) 15, actual,0.01);
    }
    @Test
    public void ExpressionwithoutspaceNegativeNumbers() throws Exception {

        double actual = new ExpEval("10--5*2+5").evaluateExpression();

        assertEquals((double) 35, actual,0.01);
    }
    @Test
    public void ExpressionWithoutSpaceBrackets() throws Exception {

        double actual = new ExpEval("10-(5*2)+5").evaluateExpression();

        assertEquals((double) 5, actual,0.01);
    }
    @Test
    public void ExpressionWithoutSpaceBracketWithNegative() throws Exception {

        double actual = new ExpEval("10-(-5.0*2.5)+5").evaluateExpression();

        assertEquals((double) 27.5f, actual,0.01);
    }
    @Test
    public void ExpressionWithoutSpaceNestedBracket() throws Exception {
        double actual = new ExpEval("(10*(-5-2))+5").evaluateExpression();

        assertEquals(-65d , actual,0.01);
    }
    @Test
    public void ExpressionWithTwoMinus() throws Exception {

        double actual = new ExpEval("2.25 -- 0.25").evaluateExpression();

        assertEquals((double) 2.50f, actual,0.01);
    }
    @Test
    public void ExpressionWithOneOperand() throws Exception {

        double actual = new ExpEval("-(-10)").evaluateExpression();

        assertEquals(10d, actual,0.01);
    }

    @Test (expected = Exception.class)
    public void ExpressionWithMultiplicationOperatorAndOneOperand() throws Exception {

        new ExpEval("*10").evaluateExpression();
    }
}

