package com.gdn.onboarding.java.two.project;

import java.util.ArrayList;

public class BubbleSort {
    public Integer[] sort(Integer[] array) {
        if (array == null) throw new IllegalArgumentException("Array must not be null.");

        Integer n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {
                    Integer temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;
    }
}
