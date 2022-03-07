package com.gdn.onboarding.two.onboardingjava.calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    public void testCalendar_success(){
        Calendar calendar = new Calendar();
        String answer = calendar.checkMonths(1);
        Assertions.assertEquals("January" , answer);
    }

    @Test
    public void testCalendar_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calendar calendar = new Calendar();
            String answer = calendar.checkMonths(null);
            Assertions.assertEquals("January" , answer);
        });
    }


}