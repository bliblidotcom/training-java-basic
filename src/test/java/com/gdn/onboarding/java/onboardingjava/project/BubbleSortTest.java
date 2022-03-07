package com.gdn.onboarding.java.onboardingjava.project;

import com.gdn.onboarding.java.onboardingjava.project.bubblesort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void sortTest(){
        int numbers[] = { 5, 3, 1, 2, 4};
        BubbleSort bs = new BubbleSort();
        int[] result = bs.sort(numbers);
        int expected[] = {1,2,3,4,5};
        Assertions.assertTrue(Arrays.equals(expected, result));
    }

}
