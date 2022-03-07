package com.gdn.onboarding.java.project;

public class BubbleSort {

    public void sort(Integer[] numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Numbers should not be null");
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[i]) {
                    Integer temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }

}
