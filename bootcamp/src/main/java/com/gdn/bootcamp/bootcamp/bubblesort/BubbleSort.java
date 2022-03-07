package com.gdn.bootcamp.bootcamp.bubblesort;

public class BubbleSort {

    public void validate(Integer[] array){
        if(array==null){
            throw new IllegalArgumentException("Invalid Parameters");
        }
    }

    public Integer[] sort(Integer[] array){
        validate(array);
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        return array;
    }
}
