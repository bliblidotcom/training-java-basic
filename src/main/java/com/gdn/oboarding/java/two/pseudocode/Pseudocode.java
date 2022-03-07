package com.gdn.oboarding.java.two.pseudocode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Pseudocode {

    public String letterGrade(Integer score) {
        if(score == null)
            throw new IllegalArgumentException("Score may not be null");

        if(score > 100 || score < 0)
            throw new IllegalArgumentException("Score must between 0 - 100");

        if(score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 65) return "D";
        else return "E";
    }

    public String calendar(Integer monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException("Invalid Month Number");
        }
    }

    public Integer factorial (Integer number) {
        if(number == null)
            throw new IllegalArgumentException("Number may not be null");

        if(number < 0)
            throw new IllegalArgumentException("Number may not be negative");

        if(number == 0) return 1;

        return number * factorial(number - 1);
    }

    public Integer[] bubbleSort(Integer[] arr ) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
