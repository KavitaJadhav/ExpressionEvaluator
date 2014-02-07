package kavitama.ExpressionEvaluator.operationTests;

import junit.framework.Assert;
import kavitama.ExpressionEvaluator.ExclusiveOperator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExclusiveOperatorTest {
    @Test
    public void getPower() throws Exception {
        Assert.assertEquals(8d, new ExclusiveOperator().perform(2d, 3d));
    }
}
