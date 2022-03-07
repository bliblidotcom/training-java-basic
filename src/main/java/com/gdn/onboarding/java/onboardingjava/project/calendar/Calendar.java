package com.gdn.onboarding.java.onboardingjava.project.calendar;

public class Calendar {
    public String getMonthName(Integer month){

        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("Month tidak boleh lebih kecil sama dengan 0 dan lebih dari 12");
        }

        switch (month){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }

        return "Invalid";
    }
}
