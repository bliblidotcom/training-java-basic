package com.gdn.onboarding.java.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterGradeTests {

    @Test
    public void testGetGrade_success() {
        LetterGrade letterGrade = new LetterGrade();
        String grade = letterGrade.getGrade(90);

        Assertions.assertEquals("A", grade);
    }

    @Test
    public void testGetGrade_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            LetterGrade letterGrade = new LetterGrade();
            String grade = letterGrade.getGrade(null);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            LetterGrade letterGrade = new LetterGrade();
            String grade = letterGrade.getGrade(-1);
        });
    }
}
