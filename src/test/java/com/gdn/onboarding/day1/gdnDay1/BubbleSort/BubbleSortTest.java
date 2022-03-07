package com.gdn.onboarding.day1.gdnDay1.BubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort b = new BubbleSort();
    @Test
    void bubbleSortTest() {
        int[] arr = {3,2,4,1,2,5};
        int[] result = {1, 2, 2, 3, 4, 5};
        Assertions.assertArrayEquals(result,b.bubbleSort(arr));
    }

    @Test
    void bubbleSortTest2() {
        int[] arr = {5,2,4,11,53,5};
        int[] result = {2, 4, 5, 5, 11, 53};
        Assertions.assertArrayEquals(result,b.bubbleSort(arr));
    }

    @Test
    void bubbleSortTest3() {
        int[] arr = {5,2,4,11,53,5};
        int[] result = {5,2,4,11,53,5};
        Assertions.assertNotEquals(result,b.bubbleSort(arr));
    }

    @Test
    void bubbleSortTest4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int[] result = {5,2,4,11,53,5};
            Assertions.assertEquals(result, b.bubbleSort(null));
        });
    }
}