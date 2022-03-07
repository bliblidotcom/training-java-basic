package com.gdn.bootcamp.bootcamp.unitTest;

import com.gdn.bootcamp.bootcamp.bubblesort.BubbleSort;
import com.gdn.bootcamp.bootcamp.unit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSort_success(){
        Integer[] expected = {1, 2, 3, 4};
        Integer[] array = {4, 3, 1, 2};
        Integer[] result = bubbleSort.sort(array);
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    public void testSort_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            Integer[] result = bubbleSort.sort(null);
        });
    }
}
