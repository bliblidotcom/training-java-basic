package com.gdn.trainingjava.basictraining;

import java.util.Scanner;

public class CalendarApplication {
    private final int month;
    public String monthInString;

    public CalendarApplication(int number) {
        if (number == -404) {
            Scanner input = new Scanner(System.in);
            System.out.print("input month: ");
            this.month = input.nextInt();
        } else {
            this.month = number;
        }
        this.monthInString = convert();
    }

    private String convert() {
        switch (this.month) {
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
                return "Out of bounds";
        }
    }
    public static void main(String[] args) {
        CalendarApplication calendar = new CalendarApplication(-404);
        System.out.printf("month: %s", calendar.monthInString);
    }
}
