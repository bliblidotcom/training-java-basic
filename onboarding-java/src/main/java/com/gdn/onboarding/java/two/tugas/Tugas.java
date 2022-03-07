package com.gdn.onboarding.java.two.tugas;

import java.util.List;

public class Tugas {
    public static void main(String[] args) {
//        System.out.println("1. Add to-do");
//        System.out.println("2. Remove to-do");
//        System.out.println("3. Print to-do");
//        System.out.println("4. Exit");
//
//        do {
//
//        }while ()
    }

    public String grade(Integer score){
        validate(score);
        if (score < 50){
            return "F";
        }
        else if (score < 60){
            return "E";
        }
        else if (score < 70){
            return "D";
        }
        else if (score < 80){
            return "C";
        }
        else if (score < 90){
            return "B";
        }
        else{
            return "A";
        }
    }

    public String calendar(Integer month){
        validate(month);
        if (month > 12 || month < 1){
            throw new IllegalArgumentException("Value is invalid");
        }

        switch (month) {
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
            default:
                return "December";
        }
    }

    public Integer factorial(Integer times){
        validate(times);
        Integer value = 1;

        for (int i=1;i<times;i++){
            value *= (i+1);
        }

        return value;
    }

    public Integer[] bubble(Integer array[]){
        Integer length = array.length;

        for (int i=0;i<length-1;i++){
            for (int j=0;j<length-i-1;j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    private void validate(Integer value){
        if (value == null){
            throw new IllegalArgumentException("Parameter is null");
        }
    }

    public List<String> add(List<String> list, String string){
        list.add(string);

        return list;
    }

    public List<String> remove(List<String> list, String string){
        list.remove(string);

        return list;
    }

    public void print(List<String> list){
        for (String string : list){
            System.out.println(string);
        }
    }
}
