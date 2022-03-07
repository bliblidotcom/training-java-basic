package com.gdn.onboarding.two.onboardingjava.letterGrade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {

    @Test
    public void testCheckLetter_success(){
        LetterGrade letterGrade = new LetterGrade();
        String answer = letterGrade.checkGrade(65);
        Assertions.assertEquals("C", answer);
    }

    @Test
    public void testCheckLetter_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            LetterGrade letterGrade = new LetterGrade();
            String answer = letterGrade.checkGrade(null);
            Assertions.assertEquals("C", answer);
        });
    }


}