package com.gdn.onboarding.java.onboardingjava.project.pseudocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PseudocodeTest {
    public static final Pseudocode code = new Pseudocode();

    @Test
    public void letterGrade_success() {
        String result = code.letterGrade(101);
        Assertions.assertEquals("A", result);
    }

    @Test
    public void letterGrade_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String result = code.letterGrade(null);
            Assertions.assertEquals("A", result);
        });
    }

    @Test
    public void calendar_success() {
        String result = code.calendar(2);
        Assertions.assertEquals("Februari", result);
    }

    @Test
    public void calendar_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String result = code.calendar(null);
            Assertions.assertEquals("Februari", result);
        });
    }

    @Test
    public void factorial_success() {
        Integer result = code.factorial(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    public void factorial_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Integer result = code.factorial(null);
            Assertions.assertEquals(120, result);
        });
    }

    @Test
    public void bubbleSort_success() {
        Integer[] unsortedArr = {5, 2, 4, 3, 1};
        Integer[] expectedResult = {1, 2, 3, 4, 5};
        Integer[] result = code.bubbleSort(unsortedArr);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void bubbleSort_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Integer[] expectedResult = {1, 2, 3, 4, 5};
            Integer[] result = code.bubbleSort(null);
            Assertions.assertArrayEquals(expectedResult, result);
        });
    }
}
