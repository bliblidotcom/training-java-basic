package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalendarTest {
    @Test
    public void checkMonthTest() throws Exception{
        Logger log = LoggerFactory.getLogger(Calendar.class);
        String result = new Calendar().checkMonth(1);
        if(!result.equals("January")){
            log.info("Test Fail");
            throw new Exception();
        }
    }
}
