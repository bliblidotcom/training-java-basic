package com.gdn.onboarding.java.pseudocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();
    Vector<Integer> arr = new Vector<>();

    @BeforeEach
    public void initVector(){
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(3);
    }

    @Test
    public void checkFirstIndex(){
        Vector<Integer> result = bubbleSort.bubbleSort(arr);

        Assertions.assertEquals(1, result.get(0));
    }

    @Test
    public void checkSecondIndex(){
        Vector<Integer> result = bubbleSort.bubbleSort(arr);

        Assertions.assertEquals(2, result.get(1));
    }

    @Test
    public void checkThirdIndex(){
        Vector<Integer> result = bubbleSort.bubbleSort(arr);

        Assertions.assertEquals(3, result.get(2));
    }

    @Test
    public void checkFourthIndex(){
        Vector<Integer> result = bubbleSort.bubbleSort(arr);

        Assertions.assertEquals(4, result.get(3));
    }

    @Test
    public void checkLastIndex(){
        Vector<Integer> result = bubbleSort.bubbleSort(arr);

        Assertions.assertEquals(5, result.get(result.size()-1));
    }

}
