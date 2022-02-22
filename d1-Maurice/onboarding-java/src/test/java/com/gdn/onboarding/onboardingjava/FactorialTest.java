package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactorialTest {
    @Test
    public void resultTest() throws Exception{
        Logger logger = LoggerFactory.getLogger(Factorial.class);
        Factorial fa = Factorial.getInstance();

        if(fa.calculation(5) != 120){
            logger.info("Test Failed");
            throw new Exception();
        }

        if(fa.calculation(-1) != null){
            logger.info("Test Failed");
            throw new Exception();
        }
    }
}
