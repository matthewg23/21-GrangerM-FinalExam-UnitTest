import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class StringCalculatorTest {

    private StringCalculator calculatorClass;

    @BeforeEach
    public void setUp() {
        calculatorClass = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        calculatorClass = null;
    }

    @Test
    public void test1() {

    }

}