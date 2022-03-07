package com.gdn.onboarding.java.onboardingjava.project;

import com.gdn.onboarding.java.onboardingjava.calc.Calculator;
import com.gdn.onboarding.java.onboardingjava.project.calendar.Calendar;
import com.gdn.onboarding.java.onboardingjava.project.lettergrade.LetterGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {
    @Test
    public void getMonthName_Failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calendar c = new Calendar();
            String result = c.getMonthName(-1);
            Assertions.assertEquals("Invalid",result);
        });
    }

    @Test
    public void getMonthName_January(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(1);
        Assertions.assertEquals("January", monthName);
    }

    @Test
    public void getMonthName_February(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(2);
        Assertions.assertEquals("February", monthName);
    }

    @Test
    public void getMonthName_March(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(3);
        Assertions.assertEquals("March", monthName);
    }

    @Test
    public void getMonthName_April(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(4);
        Assertions.assertEquals("April", monthName);
    }

    @Test
    public void getMonthName_May(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(5);
        Assertions.assertEquals("May", monthName);
    }

    @Test
    public void getMonthName_June(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(6);
        Assertions.assertEquals("June", monthName);
    }

    @Test
    public void getMonthName_July(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(7);
        Assertions.assertEquals("July", monthName);
    }

    @Test
    public void getMonthName_August(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(8);
        Assertions.assertEquals("August", monthName);
    }

    @Test
    public void getMonthName_September(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(9);
        Assertions.assertEquals("September", monthName);
    }

    @Test
    public void getMonthName_October(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(10);
        Assertions.assertEquals("October", monthName);
    }

    @Test
    public void getMonthName_November(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(11);
        Assertions.assertEquals("November", monthName);
    }

    @Test
    public void getMonthName_December(){
        Calendar c = new Calendar();
        String monthName = c.getMonthName(12);
        Assertions.assertEquals("December", monthName);
    }
}
