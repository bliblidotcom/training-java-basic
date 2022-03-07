package com.gdn.onboarding.java.two.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalenderTest {
    public static final Calender calender = new Calender();

    @Test
    void getMonthByInteger_success1() {
        String result = calender.getMonthByInteger(1);
        String expected = "Januari";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success2() {
        String result = calender.getMonthByInteger(2);
        String expected = "Februari";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success3() {
        String result = calender.getMonthByInteger(3);
        String expected = "Maret";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success4() {
        String result = calender.getMonthByInteger(4);
        String expected = "April";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success5() {
        String result = calender.getMonthByInteger(5);
        String expected = "Mei";
        Assertions.assertEquals(expected, result);
    }
    @Test
    void getMonthByInteger_success6() {
        String result = calender.getMonthByInteger(6);
        String expected = "Juni";
        Assertions.assertEquals(expected, result);
    }
    @Test
    void getMonthByInteger_success7() {
        String result = calender.getMonthByInteger(7);
        String expected = "Juli";
        Assertions.assertEquals(expected, result);
    }
    @Test
    void getMonthByInteger_success8() {
        String result = calender.getMonthByInteger(8);
        String expected = "Agustus";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success9() {
        String result = calender.getMonthByInteger(9);
        String expected = "September";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success10() {
        String result = calender.getMonthByInteger(10);
        String expected = "Oktober";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success11() {
        String result = calender.getMonthByInteger(11);
        String expected = "November";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_success12() {
        String result = calender.getMonthByInteger(12);
        String expected = "Desember";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMonthByInteger_fail1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = calender.getMonthByInteger(null);
            String expected = "Desember";
            Assertions.assertEquals(expected, result);
        });
    }

    @Test
    void getMonthByInteger_fail2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = calender.getMonthByInteger(-1);
            String expected = "Desember";
            Assertions.assertEquals(expected, result);
        });
    }
}