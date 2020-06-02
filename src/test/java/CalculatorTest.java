import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @Test
    public void sumTest() {
        Assert.assertEquals(5, calculator.sum().operation(2, 3));
    }

    @Test
    public void subTest() {
        Assert.assertEquals(2, calculator.sub().operation(4, 2));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(12, calculator.multiply().operation(6, 2));
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(3, calculator.divide().operation(6, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        Calculator calculator = new Calculator();
        calculator.divide().operation(9, 0);
    }

    @Test
    public void exponentTest() {
        Assert.assertEquals(1 / 4, calculator.exponent().operation(2, -2));
    }
}
