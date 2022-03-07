package com.gdn.onboarding.java.two.assignment.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    public static final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testBubbleSort_success() {
        Integer[] arrayOfInteger = {9, -2, 4, -3, 9, 11};
        Integer[] result = bubbleSort.sortInteger(arrayOfInteger);

        Integer[] expectedSortedArray = {-3, -2, 4, 9, 9, 11};
        Assertions.assertArrayEquals(expectedSortedArray, result);
    }

    @Test
    public void testBubbleSort_failed() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            Integer[] arrayOfInteger = {};
            Integer[] result = bubbleSort.sortInteger(arrayOfInteger);

            Integer[] expectedSortedArray = {null};
            Assertions.assertArrayEquals(expectedSortedArray, result);
        });
    }

}