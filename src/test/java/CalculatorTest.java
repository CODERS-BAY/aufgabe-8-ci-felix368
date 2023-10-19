import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {
       Assertions.assertEquals(Calculator.subtract(3,2),100);
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(Calculator.multiply(2,3),6);
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(Calculator.divide(6,2),3);
    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.assertThrows(ArithmeticException.class,()->{
            Calculator.divide(6,0);
        });
    }

    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class,()->{
            Calculator.divide(6,0);
        });

        Assertions.assertTrue(thrown.getMessage().contains("Cannot divide by zero"));
    }
}