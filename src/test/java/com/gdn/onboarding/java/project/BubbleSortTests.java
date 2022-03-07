package com.gdn.onboarding.java.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    @Test
    public void testBubbleSort_success() {
        Integer[] numbers = new Integer[]{3, 6, 32, 57, 2, 76, 23, 1, 20, 9};
        Integer[] sorted = new Integer[]{1, 2, 3, 6, 9, 20, 23, 32, 57, 76};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);

        Assertions.assertArrayEquals(sorted, numbers);
    }

    @Test
    public void testBubbleSort_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(null);
        });
    }

}
