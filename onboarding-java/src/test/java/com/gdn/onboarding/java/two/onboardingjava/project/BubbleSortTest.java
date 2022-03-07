package com.gdn.onboarding.java.two.onboardingjava.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void testBubbleSort_success1(){
        int[] arr = {20,8,21,43,2,34,56,78,54,31};
        BubbleSort bs = new BubbleSort();
        int[] result = bs.bubbleSort(arr);

        int[] ans={2,8,20,21,31,34,43,54,56,78};
        Assertions.assertArrayEquals(ans, result);
    }
}