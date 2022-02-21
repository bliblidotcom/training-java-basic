package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.LetterGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LetterGradeTest {
    LetterGrade letterGrade;

    @BeforeEach
    void createLetterGrade() {
        letterGrade = new LetterGradeImpl();
    }

    @Test
    void convert_NumberRange90to100_A() {
        char result = letterGrade.convert(95);
        Assertions.assertEquals('A', result);
    }
}
