package com.gdn.onboarding.onboardingjava;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class LetterGradeTest {

    @Test
    public void testShowScore_success() throws Exception{

        LetterGrade Budi = new LetterGrade(88);
        log.info(Budi.showScore());

        if (Budi.showScore() != "A"){
            System.out.println("Test Failed");
            throw new Exception();
        }
    }

    @Test
    public void testShowScore_fail() throws Exception{

        LetterGrade FailBudi = new LetterGrade(78);
        log.info(FailBudi.showScore());

        if (FailBudi.showScore() == "A"){
            System.out.println("Test Failed");
            throw new Exception();
        }
    }

    @Test
    public void testShowScore_error() throws Exception{

        LetterGrade NotBudi = new LetterGrade(101);
        Assertions.assertThrows(Exception.class, () -> NotBudi.showScore());

    }
}
