package com.gdn.onboarding.java.two.assignment.bubblesort;

public class BubbleSort {

    public Integer[] sortInteger(Integer[] arrayOfInt) {
        Integer arrayLength = arrayOfInt.length;

        if(arrayLength == 0){
            throw new NullPointerException("Array is null!");
        }

        for(int i=0; i<arrayLength; i++){
            for(int j=i + 1; j<arrayLength; j++){
                if(arrayOfInt[i] > arrayOfInt[j]){
                    Integer temp = arrayOfInt[i];
                    arrayOfInt[i] = arrayOfInt[j];
                    arrayOfInt[j] = temp;
                }
            }
        }

        return arrayOfInt;
    }
}
