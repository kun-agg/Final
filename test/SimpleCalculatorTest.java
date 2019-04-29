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
    @Test
    public void twoPlusTwoToThePowerThreeShouldEqualFortyEight() {
        SimpleCalculator add = new SimpleCalculator(2,2);
        SimpleCalculator pow = new SimpleCalculator(add.addition(),3);
        assertEquals(64, pow.power());
    }
    @Test
    public void ThreeToThePowerTwoMinusTwoShouldEqualOne() {
        SimpleCalculator min = new SimpleCalculator(2,2);
        SimpleCalculator pow = new SimpleCalculator(3,min.subtraction());
        assertEquals(1, pow.power());
    }
    @Test
    public void ThreeTimes7MinusTwoPlusFourAfterShouldEqualTwentyThree() {
        SimpleCalculator mul = new SimpleCalculator(3,7);
        SimpleCalculator sub = new SimpleCalculator(mul.multiplication(),2);
        SimpleCalculator add = new SimpleCalculator(sub.subtraction(), 4);
        assertEquals(23, add.addition());
    }
    @Test
    public void NineDividedByTwoToThePowerOneMinus10EqualsNegativeSix() {
        SimpleCalculator div = new SimpleCalculator(9,2);
        SimpleCalculator pow = new SimpleCalculator(div.division(),1);
        SimpleCalculator sub = new SimpleCalculator(pow.power(), 10);
        assertEquals(-6, sub.subtraction());
    }
    @Test
    public void NineDividedByTwoToThePowerOneMinusNegative10EqualsNegativeFourteen() {
        SimpleCalculator div = new SimpleCalculator(9,2);
        SimpleCalculator pow = new SimpleCalculator(div.division(),1);
        SimpleCalculator sub = new SimpleCalculator(pow.power(), -10);
        assertEquals(14, sub.subtraction());
    }
}
