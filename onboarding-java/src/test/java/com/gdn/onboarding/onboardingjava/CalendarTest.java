package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {

    @Test
    public void testCheckMonth_success() {
        Calendar calendar = new Calendar();
        String result = calendar.checkMonth(2);
        Assertions.assertEquals("February", result);
    }
}
