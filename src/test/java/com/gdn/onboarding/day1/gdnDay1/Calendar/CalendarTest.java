package com.gdn.onboarding.day1.gdnDay1.Calendar;

import com.gdn.onboarding.day1.gdnDay1.Factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {
    Calendar c = new Calendar();
    @Test
    void printCalendarTest() {
        String calendar = c.printCalendar(1);
        Assertions.assertEquals("January",calendar);
        calendar = c.printCalendar(2);
        Assertions.assertEquals("February",calendar);
        calendar = c.printCalendar(3);
        Assertions.assertEquals("March",calendar);
        calendar = c.printCalendar(4);
        Assertions.assertEquals("April",calendar);
        calendar = c.printCalendar(5);
        Assertions.assertEquals("May",calendar);
        calendar = c.printCalendar(6);
        Assertions.assertEquals("June",calendar);
        calendar = c.printCalendar(7);
        Assertions.assertEquals("July",calendar);
        calendar = c.printCalendar(8);
        Assertions.assertEquals("August",calendar);
        calendar = c.printCalendar(9);
        Assertions.assertEquals("September",calendar);
        calendar = c.printCalendar(10);
        Assertions.assertEquals("October",calendar);
        calendar = c.printCalendar(11);
        Assertions.assertEquals("November",calendar);
        calendar = c.printCalendar(12);
        Assertions.assertEquals("December",calendar);
    }

    @Test
    void calendarTest() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            String calendar = c.printCalendar(-2);
            Assertions.assertEquals("December",calendar);
        });
    }
    @Test
    void calendarTest2() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            String calendar = c.printCalendar(13);
            Assertions.assertEquals("December",calendar);
        });
    }
}