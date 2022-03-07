package com.gdn.onboarding.java.pseudocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {

    Calendar calendar = new Calendar();

    @Test
    public void getMonthJanuary(){
        String month = calendar.getMonth(1);
        Assertions.assertEquals("January", month);
    }

    @Test
    public void getMonthFebruary(){
        String month = calendar.getMonth(2);
        Assertions.assertEquals("February", month);
    }

    @Test
    public void getMonthMarch(){
        String month = calendar.getMonth(3);
        Assertions.assertEquals("March", month);
    }

    @Test
    public void getMonthApril(){
        String month = calendar.getMonth(4);
        Assertions.assertEquals("April", month);
    }

    @Test
    public void getMonthMay(){
        String month = calendar.getMonth(5);
        Assertions.assertEquals("May", month);
    }

    @Test
    public void getMonthJune(){
        String month = calendar.getMonth(6);
        Assertions.assertEquals("June", month);
    }

    @Test
    public void getMonthJuly(){
        String month = calendar.getMonth(7);
        Assertions.assertEquals("July", month);
    }

    @Test
    public void getMonthAugust(){
        String month = calendar.getMonth(8);
        Assertions.assertEquals("August", month);
    }

    @Test
    public void getMonthSeptember(){
        String month = calendar.getMonth(9);
        Assertions.assertEquals("September", month);
    }

    @Test
    public void getMonthOctober(){
        String month = calendar.getMonth(10);
        Assertions.assertEquals("October", month);
    }

    @Test
    public void getMonthNovember(){
        String month = calendar.getMonth(11);
        Assertions.assertEquals("November", month);
    }

    @Test
    public void getMonthDecember(){
        String month = calendar.getMonth(12);
        Assertions.assertEquals("December", month);
    }
}
