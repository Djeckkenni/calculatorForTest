import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Start test!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Stop test!");
    }

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.sum('+').operation(2, 3));
    }

    @Test
    public void subTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sub('-').operation(4, 2));
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(12, calculator.multiply('*').operation(6, 2));
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.divide('/').operation(6, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        Calculator calculator = new Calculator();
        calculator.divide('/').operation(9, 0);
    }

    @Test
    public void exponentTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1 / 4, calculator.exponent('^').operation(2, -2));
    }
}