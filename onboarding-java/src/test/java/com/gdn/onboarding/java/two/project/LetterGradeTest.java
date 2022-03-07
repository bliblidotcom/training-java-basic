package com.gdn.onboarding.java.two.project;

import com.gdn.onboarding.java.two.calc.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    private static final LetterGrade letterGrade = new LetterGrade();

    @Test
    void gradeNow_success1() {
        String result = letterGrade.gradeNow(100);
        String expected = "A";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void gradeNow_success2() {
        String result = letterGrade.gradeNow(65);
        String expected = "B";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void gradeNow_success3() {
        String result = letterGrade.gradeNow(45);
        String expected = "C";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void gradeNow_success4() {
        String result = letterGrade.gradeNow(20);
        String expected = "D";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void gradeNow_success5() {
        String result = letterGrade.gradeNow(0);
        String expected = "E";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void gradeNow_fail1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = letterGrade.gradeNow(null);
            String expected = "C";
            Assertions.assertEquals(expected, result);
        });
    }

    @Test
    void gradeNow_fail2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = letterGrade.gradeNow(-1);
            String expected = "C";
            Assertions.assertEquals(expected, result);
        });
    }

    @Test
    void gradeNow_fail3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = letterGrade.gradeNow(101);
            String expected = "C";
            Assertions.assertEquals(expected, result);
        });
    }
}