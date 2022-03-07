package com.gdn.onboarding.java.project;

public class MonthCalendar {

    public String getMonth(Integer month) {
        if(month == null) {
            throw new IllegalArgumentException("Month should not be null!");
        }

        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Month should be 1 to 12");
        }

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
            case 12:
                return "December";
            default:
                return "";
        }
    }

}
