package kavitama.ExpressionEvaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpEvalTest extends ExpEval {
    @Test
    public void add() throws Exception {
        float num1 = 10 ,num2 =20;
        float expected = (float) 30.0;
        float actual = add(num1, num2);
        assertEquals(actual ,expected);
    }

}
