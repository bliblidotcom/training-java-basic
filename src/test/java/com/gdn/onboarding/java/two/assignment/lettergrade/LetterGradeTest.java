package com.gdn.onboarding.java.two.assignment.lettergrade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {

    public static final LetterGrade letterGrade = new LetterGrade();

    @Test
    public void testGradeScore_A() {
        Character grade = letterGrade.gradeScore(94);
        Assertions.assertEquals('A', grade);
    }

    @Test
    public void testGradeScore_B() {
        Character grade = letterGrade.gradeScore(86);
        Assertions.assertEquals('B', grade);
    }

    @Test
    public void testGradeScore_C() {
        Character grade = letterGrade.gradeScore(70);
        Assertions.assertEquals('C', grade);
    }

    @Test
    public void testGradeScore_D() {
        Character grade = letterGrade.gradeScore(62);
        Assertions.assertEquals('D', grade);
    }

    @Test
    public void testGradeScore_E() {
        Character grade = letterGrade.gradeScore(57);
        Assertions.assertEquals('E', grade);
    }

    @Test
    public void testGradeScore_F() {
        Character grade = letterGrade.gradeScore(22);
        Assertions.assertEquals('F', grade);
    }

    @Test
    public void testGradeScore_null_failed() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            Character grade = letterGrade.gradeScore(null);
            Assertions.assertEquals('F', grade);
        });
    }

    @Test
    public void testGradeScore_belowZero_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Character grade = letterGrade.gradeScore(-9);
            Assertions.assertEquals('F', grade);
        });
    }

    @Test
    public void testGradeScore_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Character grade = letterGrade.gradeScore(102);
            Assertions.assertEquals('A', grade);
        });
    }
}