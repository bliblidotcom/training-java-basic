package two.factorial;

import com.gdn.bootcamp.day1assignment.two.factorial.Factorial;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    private static Factorial factorial;

    @BeforeAll
    public static void beforeAll() {
        factorial = new Factorial();
    }

    // normal case
    @Test
    public void testSuccessFactorial() {
        assertEquals(120, factorial.compute(5));
        assertEquals(3628800, factorial.compute(10));
    }

    // edge case
    @Test
    public void testSuccessFactorialWithZero() {
        assertThrows(IllegalArgumentException.class, () -> factorial.compute(0));
    }

    // corner case
    @Test
    public void testSuccessFactorialWithOne() {
        assertEquals(1, factorial.compute(1));
    }

    // boundary case
    @Test
    public void testFailureFactorialWithNegative() {
        assertThrows(IllegalArgumentException.class, () -> factorial.compute(-1));
    }


}
