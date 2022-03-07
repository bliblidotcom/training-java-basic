package com.gdn.onboarding.java.pseudocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterGradeTest {

    LetterGrade letterGrade = new LetterGrade();

    @Test
    public void testGradeA(){
        String grade = letterGrade.getGrade(95);
        Assertions.assertEquals("A", grade);
    }

    @Test
    @DisplayName("testGradeA-")
    public void testGradeAmin(){
        String grade = letterGrade.getGrade(85);
        Assertions.assertEquals("A-", grade);
    }

    @Test
    @DisplayName("testGradeB+")
    public void testGradeBplus(){
        String grade = letterGrade.getGrade(80);
        Assertions.assertEquals("B+", grade);
    }

    @Test
    public void testGradeB(){
        String grade = letterGrade.getGrade(75);
        Assertions.assertEquals("B", grade);
    }

    @Test
    @DisplayName("testGradeB-")
    public void testGradeBmin(){
        String grade = letterGrade.getGrade(70);
        Assertions.assertEquals("B-", grade);
    }

    @Test
    public void testGradeC(){
        String grade = letterGrade.getGrade(65);
        Assertions.assertEquals("C", grade);
    }

    @Test
    public void testGradeD(){
        String grade = letterGrade.getGrade(50);
        Assertions.assertEquals("D", grade);
    }

    @Test
    public void testGradeE(){
        String grade = letterGrade.getGrade(40);
        Assertions.assertEquals("E", grade);
    }
}
