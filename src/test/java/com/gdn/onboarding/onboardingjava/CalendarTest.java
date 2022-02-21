package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalendarTest {
    public Calendar calendar;

    @BeforeEach
    void createCalendar() {
        calendar = new CalendarImpl();
    }

    @Test
    void checkMonth_inRange_ResultOfMonth() {
        String result = calendar.checkMonth(4);
        Assertions.assertEquals("April", result);
    }

    @Test
    void checkMonth_outOfRange_ResultOfNull() {
        String result = calendar.checkMonth(13);
        Assertions.assertNull(result);
    }


}
