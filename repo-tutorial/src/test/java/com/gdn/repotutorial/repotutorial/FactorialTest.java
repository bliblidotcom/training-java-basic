package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactorialTest {

    @Test
    public void calculateFactorialTest() throws Exception{
        Logger log = LoggerFactory.getLogger(Calendar.class);
        int result = new Factorial().calculateFactorial(5);
        if(result != 120){
            log.info("Test Fail");
            throw new Exception();
        }
    }
}
