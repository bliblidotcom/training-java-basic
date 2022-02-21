package com.gdn.basic.trainingjavabasic;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetterGradeTest {

    @Test
    public void getLetterGradeTest() throws Exception{
        Logger log = LoggerFactory.getLogger(LetterGrade.class);
        LetterGrade letterGrade = new LetterGrade();

        String result = new String(letterGrade.getLetterGrade(89));
        if(!result.equals("A")){
            log.info("Test Fail");
            throw new Exception();
        }
    }
}
