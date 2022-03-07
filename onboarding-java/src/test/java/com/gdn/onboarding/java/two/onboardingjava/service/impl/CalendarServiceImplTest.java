package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalendarServiceImplTest {
    CalendarServiceImpl calendarService;
    @BeforeEach
    void setUp() {
        calendarService = new CalendarServiceImpl();
    }

    @Test
    void testGetMonthName_success() {
        Assertions.assertEquals("January", calendarService.getMonthName(1));
        Assertions.assertEquals("February", calendarService.getMonthName(2));
        Assertions.assertEquals("March", calendarService.getMonthName(3));
        Assertions.assertEquals("April", calendarService.getMonthName(4));
        Assertions.assertEquals("May", calendarService.getMonthName(5));
        Assertions.assertEquals("June", calendarService.getMonthName(6));
        Assertions.assertEquals("July", calendarService.getMonthName(7));
        Assertions.assertEquals("August", calendarService.getMonthName(8));
        Assertions.assertEquals("September", calendarService.getMonthName(9));
        Assertions.assertEquals("October", calendarService.getMonthName(10));
        Assertions.assertEquals("November", calendarService.getMonthName(11));
        Assertions.assertEquals("December", calendarService.getMonthName(12));
    }

    @Test
    void testGetMonthName_failed() {
        Assertions.assertNotEquals("January", calendarService.getMonthName(12));
        Assertions.assertNotEquals("February", calendarService.getMonthName(11));
        Assertions.assertNotEquals("March", calendarService.getMonthName(10));
        Assertions.assertNotEquals("April", calendarService.getMonthName(9));
        Assertions.assertNotEquals("May", calendarService.getMonthName(8));
        Assertions.assertNotEquals("June", calendarService.getMonthName(7));
        Assertions.assertNotEquals("July", calendarService.getMonthName(6));
        Assertions.assertNotEquals("August", calendarService.getMonthName(5));
        Assertions.assertNotEquals("September", calendarService.getMonthName(4));
        Assertions.assertNotEquals("October", calendarService.getMonthName(3));
        Assertions.assertNotEquals("November", calendarService.getMonthName(2));
        Assertions.assertNotEquals("December", calendarService.getMonthName(1));
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            calendarService.getMonthName(45);
        });
    }
}