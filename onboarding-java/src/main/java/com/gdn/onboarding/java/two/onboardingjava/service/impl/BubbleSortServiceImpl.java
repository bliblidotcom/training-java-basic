package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.SortService;

public class BubbleSortServiceImpl implements SortService {
    public BubbleSortServiceImpl() {
    }

    @Override
    public void bubbleSort(int[] numberArray) {
        int n = numberArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numberArray[j-1] > numberArray[j]){
                    temp = numberArray[j-1];
                    numberArray[j-1] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
    }
}
