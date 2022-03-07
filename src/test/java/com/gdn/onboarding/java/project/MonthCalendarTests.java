package com.gdn.onboarding.java.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthCalendarTests {

    @Test
    public void testGetMonth_success() {
        MonthCalendar calendar = new MonthCalendar();
        String month = calendar.getMonth(2);

        Assertions.assertEquals("February", month);
    }

    @Test
    public void testGetMonth_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MonthCalendar calendar = new MonthCalendar();
            String month = calendar.getMonth(null);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MonthCalendar calendar = new MonthCalendar();
            String month = calendar.getMonth(13);
        });
    }

}
