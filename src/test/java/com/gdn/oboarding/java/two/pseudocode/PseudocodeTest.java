package com.gdn.oboarding.java.two.pseudocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class PseudocodeTest {
    private final Pseudocode pseudocode = new Pseudocode();

    @Test
    public void testLetterGrade_success() {
        Integer[] testCases = {95, 80, 78, 65, 1};
        String[] expectedGrades = {"A", "B", "C", "D", "E"};

        int[] idx = { 0 };
        Arrays.stream(testCases).forEach(testCase -> {
            Assertions.assertEquals(pseudocode.letterGrade(testCase), expectedGrades[idx[0]++]);
        });
    }

    @Test
    public void testLetterGrade_failed() {
        Exception scoreLargerThan100 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pseudocode.letterGrade(110);
        });
        Exception scoreSmallerThan0 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pseudocode.letterGrade(110);
        });
        Exception nullScore = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pseudocode.letterGrade(null);
        });

        Assertions.assertTrue(scoreLargerThan100.getMessage().contains("Score must between 0 - 100"));
        Assertions.assertTrue(scoreSmallerThan0.getMessage().contains("Score must between 0 - 100"));
        Assertions.assertTrue(nullScore.getMessage().contains("Score may not be null"));
    }

    @Test
    public void testCalendar_success() {
        String[] expectedMonthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        IntStream stream = IntStream.range(1, 10);

        stream.forEach(idx -> {
            Assertions.assertEquals(pseudocode.calendar(idx), expectedMonthName[idx-1]);
        });
    }

    @Test
    public void testCalendar_failed() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pseudocode.calendar(0);
        });

        Assertions.assertEquals(exception.getMessage(), "Invalid Month Number");
    }

    @Test
    public void testFactorial_success() {
        Assertions.assertEquals(pseudocode.factorial(0), 1);
        Assertions.assertEquals(pseudocode.factorial(5), 120);
    }

    @Test
    public void testFactorial_failed() {
        Exception exceptionNegativeNumber = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pseudocode.factorial(-1);
        });
        Exception exceptionNullNumber = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pseudocode.factorial(null);
        });

        assertEquals(exceptionNegativeNumber.getMessage(), "Number may not be negative");
        assertEquals(exceptionNullNumber.getMessage(), "Number may not be null");
    }

    @Test
    public void testBubbleSort_success() {
        Integer[] arr = {5, 2, 1, 3, 4};
        Integer[] sorted = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(pseudocode.bubbleSort(arr), sorted);
    }
}