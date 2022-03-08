package two.calendar;

import com.gdn.bootcamp.day1assignment.two.calendar.Calendar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalendarTest {
    private static Calendar calendar;

    @BeforeAll
    public static void beforeAll() {
        calendar = new Calendar();
    }

    @Test
    public void testSuccessGetMonthName() {
        assertEquals("January", calendar.getMonthName(1));
        assertEquals("February", calendar.getMonthName(2));
        assertEquals("March", calendar.getMonthName(3));
        assertEquals("April", calendar.getMonthName(4));
        assertEquals("May", calendar.getMonthName(5));
        assertEquals("June", calendar.getMonthName(6));
        assertEquals("July", calendar.getMonthName(7));
        assertEquals("August", calendar.getMonthName(8));
        assertEquals("September", calendar.getMonthName(9));
        assertEquals("October", calendar.getMonthName(10));
        assertEquals("November", calendar.getMonthName(11));
        assertEquals("December", calendar.getMonthName(12));
    }

    @Test
    public void testFailGetMonthName() {
        assertThrows(IllegalArgumentException.class, () -> {
            calendar.getMonthName(0);
            calendar.getMonthName(13);
        });
    }
}
