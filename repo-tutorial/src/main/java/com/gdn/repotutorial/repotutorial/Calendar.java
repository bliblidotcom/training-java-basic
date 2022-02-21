package com.gdn.repotutorial.repotutorial;

import java.util.Scanner;

public class Calendar {

    public String checkMonth(int num){
        String result;
        switch (num){
            case 1:  result = "January";
                break;
            case 2:  result = "February";
                break;
            case 3:  result = "March";
                break;
            case 4:  result = "April";
                break;
            case 5:  result = "May";
                break;
            case 6:  result = "June";
                break;
            case 7:  result = "July";
                break;
            case 8:  result = "August";
                break;
            case 9:  result = "September";
                break;
            case 10: result = "October";
                break;
            case 11: result = "November";
                break;
            case 12: result = "December";
                break;
            default: result = "Invalid month";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Input angka : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Calendar calendar = new Calendar();
        String result = calendar.checkMonth(num);

        System.out.println(result);
    }
}
