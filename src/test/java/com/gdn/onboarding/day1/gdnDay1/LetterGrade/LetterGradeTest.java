package com.gdn.onboarding.day1.gdnDay1.LetterGrade;

import com.gdn.onboarding.day1.gdnDay1.Factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {

    @Test
    void checkGradeTestA() {
        String grade = new LetterGrade().checkGrade(90);
        Assertions.assertEquals("A",grade);
        Assertions.assertNotEquals("B",grade);
    }
    @Test
    void checkGradeTestAMin() {
        String grade = new LetterGrade().checkGrade(85);
        Assertions.assertEquals("A-",grade);
        Assertions.assertNotEquals("B",grade);
    }
    @Test
    void checkGradeTestBPlus() {
        String grade = new LetterGrade().checkGrade(80);
        Assertions.assertEquals("B+",grade);
        Assertions.assertNotEquals("B",grade);
    }
    @Test
    void checkGradeTestB() {
        String grade = new LetterGrade().checkGrade(75);
        Assertions.assertEquals("B",grade);
        Assertions.assertNotEquals("A",grade);
    }
    @Test
    void checkGradeTestC() {
        String grade = new LetterGrade().checkGrade(50);
        Assertions.assertEquals("C",grade);
        Assertions.assertNotEquals("B",grade);
    }

    @Test
    void checkGradeTest() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            String grade = new LetterGrade().checkGrade(-20);
            Assertions.assertNotEquals("C",grade);
        });
    }

    @Test
    void checkGradeTest2() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            String grade = new LetterGrade().checkGrade(null);
            Assertions.assertNotEquals("C",grade);
        });
    }
}