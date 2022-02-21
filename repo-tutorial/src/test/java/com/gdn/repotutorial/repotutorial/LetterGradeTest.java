package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class LetterGradeTest {

    @Test
    public void convertGradeTest() throws Exception{
        char result = new LetterGrade().convertGrade(90);
        if(result != 'A'){
            System.out.println("Test Fail");
            throw new Exception();
        }
    }
}
