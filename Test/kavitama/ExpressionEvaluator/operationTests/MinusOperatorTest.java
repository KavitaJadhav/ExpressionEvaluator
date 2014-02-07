package kavitama.ExpressionEvaluator.operationTests;

import junit.framework.Assert;
import kavitama.ExpressionEvaluator.MinusOperator;
import org.junit.Test;

public class MinusOperatorTest {

    @Test
    public void performSubtraction() throws Exception {
        Assert.assertEquals(8d, new MinusOperator().perform(10d, 2d));
    }
}
