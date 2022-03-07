package com.gdn.onboarding.java.pseudocode;

import java.util.Vector;

public class BubbleSort {

    public Vector<Integer> bubbleSort(Vector<Integer> arr){

        for(int a = 0; a < arr.size(); a++){
            for(int b = a+1; b < arr.size(); b++){
                if(arr.get(b) < arr.get(a)){
                    int num = arr.get(a);
                    arr.set(a, arr.get(b));
                    arr.set(b, num);
                }
            }
        }

        return arr;
    }

}
