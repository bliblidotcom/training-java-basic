package com.gdn.onboarding.onboardingjava;

public class Calendar {

    public String getBulan(int n) throws Exception {
        switch(n) {
            case 1:
                return "JANUARI";
            case 2:
                return "FEBRUARI";
            case 3:
                return "MARET";
            case 4:
                return "APRIL";
            case 5:
                return "MEI";
            case 6:
                return "JUNI";
            case 7:
                return "JULI";
            case 8:
                return "AGUSTUS";
            case 9:
                return "SEPTEMBER";
            case 10:
                return "OKTOBER";
            case 11:
                return "NOVEMBER";
            case 12:
                return "DESEMBER";
            default:
                throw new Exception();
        }
    }

}
