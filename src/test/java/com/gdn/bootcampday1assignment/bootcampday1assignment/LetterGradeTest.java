package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LetterGradeTest {

    private static final LetterGrade letterGrade = new LetterGrade();

    @Test
    public void testGetGrade_success(){
        Assertions.assertEquals("A", letterGrade.getGrade(95));
    }

    @Test
    public void testGetGrade_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Assertions.assertEquals("A", letterGrade.getGrade(-10));
        });
    }
}