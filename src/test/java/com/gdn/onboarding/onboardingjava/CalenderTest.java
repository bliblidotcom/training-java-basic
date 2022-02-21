package com.gdn.onboarding.onboardingjava;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class CalenderTest {

    @Test
    public void testShowMonth_success() throws Exception{

        Calender january = new Calender(1);
        log.info(january.showMonth());

        if (january.showMonth() != "January"){
            System.out.println("Test Failed");
            throw new Exception();
        }
    }

    @Test
    public void testShowMonth_fail() throws Exception{

        Calender january = new Calender(5);
        log.info(january.showMonth());

        if (january.showMonth() == "January"){
            System.out.println("Test Failed");
            throw new Exception();
        }

    }

    @Test
    public void testCalender_error(){
        Calender errCalender = new Calender(14);
        Assertions.assertThrows(Exception.class, () -> errCalender.showMonth());
    }
}
