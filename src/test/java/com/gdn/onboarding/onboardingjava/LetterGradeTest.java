package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class LetterGradeTest {
    @Test
    public void testConvertToLetter_success() throws Exception {
        String tc = new LetterGrade().convertToLetter(75);
        if (!tc.equals("B")) {
            System.out.println("GAGAL");
            throw new Exception();
        }
    }
}
