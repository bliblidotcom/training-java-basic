package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterGradeTest {

    @Test
    public void testConvertGrade_success() {
        LetterGrade letterGrade = new LetterGrade();
        char result = letterGrade.convertGrade(100);
        Assertions.assertEquals('A', result);
    }
}
