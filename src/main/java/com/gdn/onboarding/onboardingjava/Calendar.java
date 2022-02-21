package com.gdn.onboarding.onboardingjava;

public class Calendar {
    private String month(int month) {
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
        String month2 = calendar.month(2);
        String month3 = calendar.month(3);
        String month4 = calendar.month(4);
        String month5 = calendar.month(5);
        String month6 = calendar.month(6);
        String month7 = calendar.month(7);
        String month8 = calendar.month(8);
        String month9 = calendar.month(9);
        String month10 = calendar.month(10);
        String month11 = calendar.month(11);
        String month12 = calendar.month(12);

        System.out.println("The first month is: " + month1);
        System.out.println("The second month is: " + month2);
        System.out.println("The third month is: " + month3);
        System.out.println("The fourth month is: " + month4);
        System.out.println("The fifth month is: " + month5);
        System.out.println("The sixth month is: " + month6);
        System.out.println("The seventh month is: " + month7);
        System.out.println("The eighth month is: " + month8);
        System.out.println("The ninth month is: " + month9);
        System.out.println("The tenth month is: " + month10);
        System.out.println("The eleventh month is: " + month11);
        System.out.println("The twelfth month is: " + month12);
    }
}
