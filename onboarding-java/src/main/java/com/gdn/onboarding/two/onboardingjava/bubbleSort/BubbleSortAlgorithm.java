package com.gdn.onboarding.two.onboardingjava.bubbleSort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class BubbleSortAlgorithm {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public BubbleSortAlgorithm(){

    }



    public Integer[] sort(Integer arr[] ){

        if(arr == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        for(int i=0 ; i<arr.length;i++){
            logger.info("{} ", arr[i]);
        }

        return arr;
    }
}
