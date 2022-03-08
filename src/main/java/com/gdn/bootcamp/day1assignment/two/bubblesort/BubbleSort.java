package com.gdn.bootcamp.day1assignment.two.bubblesort;

public class BubbleSort {

    public Integer[] ascendingOrder(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        Integer temp;
        for (Integer i = 0; i < arr.length; i++) {
            for (Integer j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
