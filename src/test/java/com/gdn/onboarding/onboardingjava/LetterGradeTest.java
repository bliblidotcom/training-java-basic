package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterGradeTest {

    @Test
    public void letterGrade_success() {
        Assertions.assertEquals("A", LetterGrade.getLetterGrade(100));
    }

    @Test
    public void letterGrade_failed() {
        Assertions.assertNotEquals("A", LetterGrade.getLetterGrade(84));
    }
}
