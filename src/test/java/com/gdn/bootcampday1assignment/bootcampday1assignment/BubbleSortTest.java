package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private static final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort_success(){

        Integer[] arrayNotSorted = {2,4,1,6,10,9,7};
        Integer[] arraySorted = {1,2,4,6,7,9,10};

        Assertions.assertArrayEquals(arraySorted, bubbleSort.sort(arrayNotSorted));
    }

    @Test
    public void testSort_failed(){

        Assertions.assertThrows(NullPointerException.class, () -> {
            Integer[] arraySortedByFunc = bubbleSort.sort(null);
        });
    }
}