package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortServiceImplTest {
    BubbleSortServiceImpl bubbleSortService;
    @BeforeEach
    void setUp() {
        bubbleSortService = new BubbleSortServiceImpl();
    }

    @Test
    void testBbbleSort_success() {
        int[] numArray = {10,3,2,7,8,1,9,5,4,6};
        int[] numArraySorted = {1,2,3,4,5,6,7,8,9,10};

        bubbleSortService.bubbleSort(numArray);

        for (int i=0; i<10; i++) {
            Assertions.assertEquals(numArraySorted[i], numArray[i]);
        }
    }
}