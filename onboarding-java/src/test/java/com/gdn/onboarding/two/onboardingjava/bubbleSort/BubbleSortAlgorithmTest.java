package com.gdn.onboarding.two.onboardingjava.bubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortAlgorithmTest {

    @Test
    public void testSort_success(){
        Integer[] arr = {5,4,3,2,1};
        Integer[] answer1 = {1,2,3,4,5};
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        Integer[] answer2 = bubbleSortAlgorithm.sort(arr);
        Assertions.assertArrayEquals(answer1, answer2);
    }

    @Test
    public void testSort_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Integer[] arr = null;
            Integer[] answer1 = {1,2,3,4,5};
            BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
            Integer[] answer2 = bubbleSortAlgorithm.sort(arr);
            Assertions.assertArrayEquals(answer1, answer2);
        });
    }

}