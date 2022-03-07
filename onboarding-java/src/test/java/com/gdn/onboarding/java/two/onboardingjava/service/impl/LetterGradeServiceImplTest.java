package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeServiceImplTest {

    LetterGradeServiceImpl letterGradeService;
    @BeforeEach
    void setUp() {
        letterGradeService = new LetterGradeServiceImpl();
    }

    @Test
    void testConvertScoreToLetterGrade_success() {

        Assertions.assertEquals("A", letterGradeService.convertScoreToLetterGrade(95));
        Assertions.assertEquals("A-", letterGradeService.convertScoreToLetterGrade(87));
        Assertions.assertEquals("B+", letterGradeService.convertScoreToLetterGrade(83));
        Assertions.assertEquals("B", letterGradeService.convertScoreToLetterGrade(79));
        Assertions.assertEquals("B-", letterGradeService.convertScoreToLetterGrade(72));
        Assertions.assertEquals("C", letterGradeService.convertScoreToLetterGrade(66));
        Assertions.assertEquals("D", letterGradeService.convertScoreToLetterGrade(63));
        Assertions.assertEquals("E", letterGradeService.convertScoreToLetterGrade(55));
    }

    @Test
    void testConvertScoreToLetterGrade_failed() {

        Assertions.assertNotEquals("E", letterGradeService.convertScoreToLetterGrade(95));
        Assertions.assertNotEquals("D", letterGradeService.convertScoreToLetterGrade(87));
        Assertions.assertNotEquals("C", letterGradeService.convertScoreToLetterGrade(83));
        Assertions.assertNotEquals("B-", letterGradeService.convertScoreToLetterGrade(79));
        Assertions.assertNotEquals("B", letterGradeService.convertScoreToLetterGrade(72));
        Assertions.assertNotEquals("B+", letterGradeService.convertScoreToLetterGrade(66));
        Assertions.assertNotEquals("A-", letterGradeService.convertScoreToLetterGrade(63));
        Assertions.assertNotEquals("A", letterGradeService.convertScoreToLetterGrade(55));
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            letterGradeService.convertScoreToLetterGrade(-2);
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            letterGradeService.convertScoreToLetterGrade(110);
        });
    }

}