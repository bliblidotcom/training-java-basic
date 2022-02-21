package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;

public class LetterGradeTest {
    @Test
    public void sameResult(){
        String result = LetterGrade.convertGrade(80);
        Assertions.assertEquals("AB", result);
    }

    @Test
    public void differentResult(){
        String result = LetterGrade.convertGrade(80);
        Assertions.assertNotEquals("B", result);
    }
}
