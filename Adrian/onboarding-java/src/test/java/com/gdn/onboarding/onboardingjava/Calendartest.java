package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;

public class Calendartest {
    @Test
    public void sameResult(){
        String result = Calendar.convertCalendar(2);
        Assertions.assertEquals("February", result);
    }

    @Test
    public void differentResult(){
        String result = Calendar.convertCalendar(3);
        Assertions.assertNotEquals("February", result);
    }
}
