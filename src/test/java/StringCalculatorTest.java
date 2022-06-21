import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;


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
    public void testforExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> { calculatorClass.add("-1,5");
        });
    }

    @Test
    public void testforNgreaterThanorEqualTo1000() {
        assertThrows(IllegalArgumentException.class, () -> { calculatorClass.add("1000,5");
        });
    }

}
