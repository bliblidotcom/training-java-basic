package com.gdn.onboarding.java.two.onboardingjava.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    @Test
    public void testGrading_success1(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(100);

        Assertions.assertEquals( "A", result);
    }
    @Test
    public void testGrading_success2(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(85);

        Assertions.assertEquals( "A-", result);
    }
    @Test
    public void testGrading_success3(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(83);

        Assertions.assertEquals( "B+", result);
    }
    @Test
    public void testGrading_success4(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(79);

        Assertions.assertEquals( "B", result);
    }
    @Test
    public void testGrading_success5(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(74);

        Assertions.assertEquals( "B-", result);
    }
    @Test
    public void testGrading_success6(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(69);

        Assertions.assertEquals( "C", result);
    }
    @Test
    public void testGrading_success7(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(60);

        Assertions.assertEquals( "D", result);
    }
    @Test
    public void testGrading_success8(){
        LetterGrade lg = new LetterGrade();
        String result = lg.doGrade(45);

        Assertions.assertEquals( "E", result);
    }
    @Test
    public void testGrading_failed1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            LetterGrade lg = new LetterGrade();
            String result = lg.doGrade(45);

            Assertions.assertEquals( "E", result);
        });
    }
    @Test
    public void testGrading_failed2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            LetterGrade lg = new LetterGrade();
            String result = lg.doGrade(-1);

            Assertions.assertEquals( "E", result);
        });
    }
}