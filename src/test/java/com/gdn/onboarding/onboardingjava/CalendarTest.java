package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {

    @Test
    public void calendar_success() {
        Assertions.assertEquals("February", Calendar.toMonth(2));
    }

    @Test
    public void calendar_failed() {
        Assertions.assertNotEquals("February", Calendar.toMonth(1));
    }
}
