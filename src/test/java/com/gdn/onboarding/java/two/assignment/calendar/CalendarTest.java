package com.gdn.onboarding.java.two.assignment.calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    public static final Calendar calendar = new Calendar();

    @Test
    public void testConvertToMonth_Jan() {
        String month = calendar.convertToMonth(1);
        Assertions.assertEquals("January", month);
    }

    @Test
    public void testConvertToMonth_Feb() {
        String month = calendar.convertToMonth(2);
        Assertions.assertEquals("February", month);
    }

    @Test
    public void testConvertToMonth_Mar() {
        String month = calendar.convertToMonth(3);
        Assertions.assertEquals("March", month);
    }

    @Test
    public void testConvertToMonth_Apr() {
        String month = calendar.convertToMonth(4);
        Assertions.assertEquals("April", month);
    }

    @Test
    public void testConvertToMonth_May() {
        String month = calendar.convertToMonth(5);
        Assertions.assertEquals("May", month);
    }

    @Test
    public void testConvertToMonth_Jun() {
        String month = calendar.convertToMonth(6);
        Assertions.assertEquals("June", month);
    }

    @Test
    public void testConvertToMonth_Jul() {
        String month = calendar.convertToMonth(7);
        Assertions.assertEquals("July", month);
    }

    @Test
    public void testConvertToMonth_Aug() {
        String month = calendar.convertToMonth(8);
        Assertions.assertEquals("August", month);
    }

    @Test
    public void testConvertToMonth_Sept() {
        String month = calendar.convertToMonth(9);
        Assertions.assertEquals("September", month);
    }

    @Test
    public void testConvertToMonth_Oct() {
        String month = calendar.convertToMonth(10);
        Assertions.assertEquals("October", month);
    }

    @Test
    public void testConvertToMonth_Nov() {
        String month = calendar.convertToMonth(11);
        Assertions.assertEquals("November", month);
    }

    @Test
    public void testConvertToMonth_Dec() {
        String month = calendar.convertToMonth(12);
        Assertions.assertEquals("December", month);
    }

    @Test
    public void testConvertToMonth_InvalidNum() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String month = calendar.convertToMonth(13);
            Assertions.assertEquals("January", month);
        });
    }

    @Test
    public void testConvertToMonth_failed() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            String month = calendar.convertToMonth(null);
            Assertions.assertEquals("January", month);
        });
    }

}