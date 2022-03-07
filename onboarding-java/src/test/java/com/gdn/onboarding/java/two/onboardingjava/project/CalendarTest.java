package com.gdn.onboarding.java.two.onboardingjava.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {
    @Test
    public void testCalendar_success1(){
        Calendar c = new Calendar();
        String result = c.calendar(1);

        Assertions.assertEquals("January", result);
    }
    @Test
    public void testCalendar_success2(){
        Calendar c = new Calendar();
        String result = c.calendar(2);

        Assertions.assertEquals("February", result);
    }
    @Test
    public void testCalendar_success3(){
        Calendar c = new Calendar();
        String result = c.calendar(3);

        Assertions.assertEquals("March", result);
    }
    @Test
    public void testCalendar_success4(){
        Calendar c = new Calendar();
        String result = c.calendar(4);

        Assertions.assertEquals("April", result);
    }
    @Test
    public void testCalendar_success5(){
        Calendar c = new Calendar();
        String result = c.calendar(5);

        Assertions.assertEquals("May", result);
    }
    @Test
    public void testCalendar_success6(){
        Calendar c = new Calendar();
        String result = c.calendar(6);

        Assertions.assertEquals("June", result);
    }
    @Test
    public void testCalendar_success7(){
        Calendar c = new Calendar();
        String result = c.calendar(7);

        Assertions.assertEquals("July", result);
    }
    @Test
    public void testCalendar_success8(){
        Calendar c = new Calendar();
        String result = c.calendar(8);

        Assertions.assertEquals("August", result);
    }
    @Test
    public void testCalendar_success9(){
        Calendar c = new Calendar();
        String result = c.calendar(9);

        Assertions.assertEquals("September", result);
    }
    @Test
    public void testCalendar_success10(){
        Calendar c = new Calendar();
        String result = c.calendar(10);

        Assertions.assertEquals("October", result);
    }
    @Test
    public void testCalendar_success11(){
        Calendar c = new Calendar();
        String result = c.calendar(11);

        Assertions.assertEquals("November", result);
    }
    @Test
    public void testCalendar_success12(){
        Calendar c = new Calendar();
        String result = c.calendar(12);

        Assertions.assertEquals("December", result);
    }
    @Test
    public void testFactorial_failed1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calendar c = new Calendar();
            String result = c.calendar(null);

            Assertions.assertEquals("December", result);
        });
    }
    @Test
    public void testFactorial_failed2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calendar c = new Calendar();
            String result = c.calendar(15);

            Assertions.assertEquals("December", result);
        });
    }
}