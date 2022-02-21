package com.gdn.trainingjava.basictraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterGradeTests {
    @Test
    public void ConvertTest() {
        LetterGradeApplication letter = new LetterGradeApplication(77);
        Assertions.assertEquals(letter.grade, 'A');
    }
}
