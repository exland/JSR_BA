package at.tugraz.ist.stracke.jsr;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    public CalculatorTest() {
    }

    @Test
    public void add() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(10, calc.add(4, 6));
    }

    @Test
    @Ignore("Redundant Test Case (identified by JSR)")
    public void add2() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(10, calc.add(4, 6));
    }

    @Test
    @Ignore("Redundant Test Case (identified by JSR)")
    public void add3() {
        Calculator calc = new Calculator("henri");
        int res = calc.add(4, 6);
        Assert.assertEquals(10, res);
    }

    @Test
    @Ignore("Redundant Test Case (identified by JSR)")
    public void addCommutativity() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(calc.add(6, 4), calc.add(4, 6));
    }

    @Test
    public void divide() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(4, calc.divide(100, 25));
    }

    @Test
    @Ignore("Redundant Test Case (identified by JSR)")
    public void divideByZero() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(-1, calc.divide(100, 0));
    }

    @Test
    @Ignore("Redundant Test Case (identified by JSR)")
    public void divideZeroByNotZero() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(0, calc.divide(0, 999));
    }

    @Test
    @Ignore("Redundant Test Case (identified by JSR)")
    public void shouldFail() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(1, calc.add(0, 0));
    }
}
