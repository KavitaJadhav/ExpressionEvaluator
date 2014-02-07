package kavitama.ExpressionEvaluator.operationTests;

import junit.framework.Assert;
import kavitama.ExpressionEvaluator.PlusOperator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlusOperatorTest {
    @Test
    public void performAddition() throws Exception {
        Assert.assertEquals(5d, new PlusOperator().perform(2d, 3d));
    }
}
