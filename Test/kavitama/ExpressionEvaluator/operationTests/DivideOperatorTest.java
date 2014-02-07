package kavitama.ExpressionEvaluator.operationTests;

import junit.framework.Assert;
import kavitama.ExpressionEvaluator.DivideOperator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DivideOperatorTest {
    @Test
    public void performDivision() throws Exception {
        Assert.assertEquals(5d, new DivideOperator().perform(10d, 2d));
    }
}
