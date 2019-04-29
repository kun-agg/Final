import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void twoPlusThreeShouldEqualFive() {
        SimpleCalculator add = new SimpleCalculator(2,3);
        assertEquals(5, add.addition());
    }
    
    @Test
    public void twominusThreeShouldEqualNegativeOne() {
        SimpleCalculator sub = new SimpleCalculator(2,3);
        assertEquals(-1, sub.subtraction());
    }
    
    @Test
    public void twoTimesThreeShouldEqualSix() {
        SimpleCalculator mul = new SimpleCalculator(2,3);
        assertEquals(6, mul.multiplication());
    }
    
    @Test
    public void twoDividedByThreeShouldEqualZero() {
        SimpleCalculator div = new SimpleCalculator(2,3);
        assertEquals(0, div.division());
    }
    
    @Test
    public void twoModuloThreeShouldEqualTwo() {
        SimpleCalculator mod = new SimpleCalculator(2,3);
        assertEquals(2, mod.modulo());
    }
    
    @Test
    public void twoToThePowerThreeShouldEqualEight() {
        SimpleCalculator pow = new SimpleCalculator(2,3);
        assertEquals(8, pow.power());
    }
}
