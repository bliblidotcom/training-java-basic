package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalendarTest {
    @Test
    public void monthNameTest() throws Exception {
        Logger logger = LoggerFactory.getLogger(Calendar.class);
        Calendar ca = Calendar.getInstance();

        if (!ca.getMonth(1).equals("January")) {
            logger.info("Test Failed");
            throw new Exception();
        }

        if (ca.getMonth(0) != null) {
            logger.info("Test Failed");
            throw new Exception();
        }
    }
}
