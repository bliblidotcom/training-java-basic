package two.lettergrade;

import com.gdn.bootcamp.day1assignment.two.lettergrade.LetterGrade;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LetterGradeTest {

    private static LetterGrade letterGrade;

    @BeforeAll
    public static void beforeAll() {
        letterGrade = new LetterGrade();
    }

    // normal case
    @Test
    public void testSuccessLetterGrade() {
        assertEquals("A", letterGrade.getLetterGrade(90.0));
        assertEquals("B", letterGrade.getLetterGrade(80.0));
        assertEquals("C", letterGrade.getLetterGrade(70.0));
        assertEquals("D", letterGrade.getLetterGrade(60.0));
        assertEquals("E", letterGrade.getLetterGrade(0.0));
    }

    @Test
    public void testFailLetterGradeWithNull() {
        assertThrows(IllegalArgumentException.class, () -> letterGrade.getLetterGrade(null));
    }

    @Test
    public void testFailLetterGradeWithBoundary() {
        assertThrows(IllegalArgumentException.class, () -> letterGrade.getLetterGrade(101.0));
        assertThrows(IllegalArgumentException.class, () -> letterGrade.getLetterGrade(-1.0));
    }

}
