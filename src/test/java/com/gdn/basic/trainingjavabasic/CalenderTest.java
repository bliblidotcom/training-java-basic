package com.gdn.basic.trainingjavabasic;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalenderTest {

    @Test
    public void convertToMonthTest() throws Exception{
        Logger log = LoggerFactory.getLogger(Calender.class);
        Calender calender = new Calender();

        String result = calender.convertToMonth(1);

        if(!result.equals("Januari")){
            log.info("Test Fail");
            throw new Exception();
        }
    }
}
