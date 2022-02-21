package com.gdn.onboarding.onboardingjava;

public class Lettergrade {

    public char getGrade(int n) throws Exception {
        if (n < 0 || n > 100) throw new Exception();
        if (n > 80) {
            return 'A';
        } else if (n > 70) {
            return 'B';
        } else if (n > 60) {
            return 'C';
        } else if (n > 50) {
            return 'D';
        } else {
            return 'E';
        }
    }

}
