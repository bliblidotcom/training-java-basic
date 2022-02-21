package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.Calendar;

public class CalendarImpl implements Calendar {

    @Override
    public String checkMonth(int month) {
        String result;
        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "Fabruary";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "Desember";
                break;
            default:
                result = null;
                break;
        }
        return result;
    }
}
