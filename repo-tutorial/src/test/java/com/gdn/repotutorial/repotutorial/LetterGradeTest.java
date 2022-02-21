package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetterGradeTest {

    @Test
    public void convertGradeTest() throws Exception{
        Logger log = LoggerFactory.getLogger(Calendar.class);
        char result = new LetterGrade().convertGrade(90);
        if(result != 'A'){
            log.info("Test Fail");
            throw new Exception();
        }
    }
}
