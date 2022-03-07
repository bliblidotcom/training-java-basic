package com.gdn.onboarding.java.two.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private static final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void sort_success() {
        Integer[] array = {3, 0, -1, 2};
        array = bubbleSort.sort(array);
        Integer[] expected = {-1, 0, 2, 3};

        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    void sort_fail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer[] array = null;
            array = bubbleSort.sort(array);
            Integer[] expected = {-1, 0, 2, 3};

            Assertions.assertArrayEquals(expected, array);
        });
    }
}