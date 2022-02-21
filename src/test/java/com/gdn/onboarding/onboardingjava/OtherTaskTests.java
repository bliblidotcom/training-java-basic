package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OtherTaskTests {

    OtherTask otherTask;

    @BeforeEach
    void setUp() {
        otherTask = new OtherTask();
    }

    @Test
    void testFactorialSuccess() throws Exception {
        Assertions.assertEquals(120, otherTask.factorial(5));
    }

    @Test
    void testFactorialFailed() {
        Assertions.assertThrows(Exception.class, () -> {
            otherTask.factorial(-1);
        });
    }

    @Test
    void testLetterGradeSuccess() throws Exception {
        Assertions.assertEquals("A", otherTask.letterGrade(90));
    }

    @Test
    void testLetterGradeFailed() {
        Assertions.assertThrows(Exception.class, () -> {
            otherTask.letterGrade(-1);
        });
    }

    @Test
    void testMonthNameSuccess() throws Exception {
        Assertions.assertEquals("Januari", otherTask.monthName(1));
    }

    @Test
    void testMonthFailed() {
        Assertions.assertThrows(Exception.class, () -> {
            otherTask.monthName(0);
        });
    }
}
