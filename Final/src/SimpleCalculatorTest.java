import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void twoPlusThreeShouldEqualFive() {
        SimpleCalculator add = new SimpleCalculator(2,3);
        assertEquals(5, add.addition());
    }
}
