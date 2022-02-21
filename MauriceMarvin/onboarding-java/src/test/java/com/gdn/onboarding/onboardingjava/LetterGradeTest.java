package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetterGradeTest {

    @Test
    public void testGrade() throws Exception {
        Logger logger = LoggerFactory.getLogger(LetterGrade.class);
        LetterGrade lg = LetterGrade.getInstance();

        if (lg.result(0) != 'F') {
            logger.info("Test Failed");
            throw new Exception();
        }
    }
}
