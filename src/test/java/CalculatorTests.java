import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalculatorTests {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();

        int result = calc.add(1, 2);

        Assertions.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();

        int result = calc.subtract(10, 3);

        Assertions.assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();

        int result = calc.multiply(3, 4);

        Assertions.assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();

        double result = calc.divide(10, 4);

        Assertions.assertEquals(2.5, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();

        Executable operation = () -> calc.divide(10, 0);

        Assertions.assertThrows(ArithmeticException.class, operation);
    }
}
