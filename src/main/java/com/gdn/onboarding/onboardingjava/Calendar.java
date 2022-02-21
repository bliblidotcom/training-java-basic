package com.gdn.onboarding.onboardingjava;

public class Calendar {
    protected String month(int month) {
        switch(month) {
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

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        String month1 = calendar.month(1);
        String month8 = calendar.month(8);
        String month12 = calendar.month(12);

        System.out.println("1st month is : " + month1);
        System.out.println("8th month is : " + month8);
        System.out.println("12nd month is : " + month12);
    }
}
