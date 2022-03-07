package com.gdn.onboarding.java.onboardingjava.project;

import com.gdn.onboarding.java.onboardingjava.calc.Calculator;
import com.gdn.onboarding.java.onboardingjava.project.lettergrade.LetterGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterGradeTest {
    @Test
    public void getGrade_GE90(){
        LetterGrade lg = new LetterGrade();
        String grade = lg.getGrade(95);
        Assertions.assertEquals("A", grade);
    }

    @Test
    public void getGrade_GE80(){
        LetterGrade lg = new LetterGrade();
        String grade = lg.getGrade(80);
        Assertions.assertEquals("B", grade);
    }

    @Test
    public void getGrade_GE70(){
        LetterGrade lg = new LetterGrade();
        String grade = lg.getGrade(72);
        Assertions.assertEquals("C", grade);
    }

    @Test
    public void getGrade_GE60(){
        LetterGrade lg = new LetterGrade();
        String grade = lg.getGrade(65);
        Assertions.assertEquals("D", grade);
    }

    @Test
    public void getGrade_L60(){
        LetterGrade lg = new LetterGrade();
        String grade = lg.getGrade(40);
        Assertions.assertEquals("E", grade);
    }
}
