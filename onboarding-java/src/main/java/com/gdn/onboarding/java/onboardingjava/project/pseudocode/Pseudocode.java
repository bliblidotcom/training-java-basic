package com.gdn.onboarding.java.onboardingjava.project.pseudocode;

public class Pseudocode {
    public static void main(String[] args) {
        new Pseudocode();
    }

    public Pseudocode(){
//        System.out.println(letterGrade(10));
//        System.out.println(calendar(12));
//        System.out.println(factorial(5));
//
//        Integer[] arr = {1, 3, 5, 2, 7, 4};
//        arr = bubbleSort(arr);
//        for (int num: arr) System.out.print(num + " ");
    }

    private void validate(Integer value) {
        if (value == null) throw new IllegalArgumentException("Parameter cannot be null");
    }

    private void validateArr(Integer[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cannot be null");
    }

    public String letterGrade(Integer value) {
        validate(value);
        if (value > 90) return "A";
        else if (value >= 80 && value < 90) return "B";
        else if (value >= 70 && value < 80) return "C";
        else if (value >= 60 && value < 70) return "D";
        else return "E";
    }

    public String calendar(Integer monthNumber) {
        validate(monthNumber);
        switch (monthNumber) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default: throw new IllegalArgumentException("Bulan harus di antara angka 1 - 12");
        }
    }

    public Integer factorial(Integer n) {
        validate(n);
        if (n > 1) return n*factorial(n-1);
        else if (n>=0) return 1;
        else throw new IllegalArgumentException("Angka tidak boleh negatif [0-n]");
    }

    public Integer[] bubbleSort(Integer[] arr) {
        validateArr(arr);
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        return arr;
    }
}
