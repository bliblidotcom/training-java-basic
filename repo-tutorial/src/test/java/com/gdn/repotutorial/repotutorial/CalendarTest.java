package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;

public class CalendarTest {

    @Test
    public void checkMonthTest() throws Exception{
        String result = new Calendar().checkMonth(1);
        if(!result.equals("January")){
            System.out.println("Test Fail");
            throw new Exception();
        }
    }
}
