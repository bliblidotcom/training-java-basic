package com.gdn.onboarding.onboardingjava;

public class OtherTask {
    public String letterGrade(int grade) throws Exception {
        // A -> A >= 80
        // B -> 70 <= grade < 80
        // C -> 60 <= grade < 70
        // D -> 55 <= grade < 60
        // E -> 0 <= grade < 55 (Other)

        if (grade >= 80) {
            return "A";
        } else if (grade >= 70) {
            return "B";
        } else if (grade >= 60) {
            return "C";
        } else if (grade >= 55) {
            return "D";
        } else if (grade >= 0) {
            return "E";
        } else {
            throw new Exception();
        }
    }

    public String monthName(int monthNumber) throws Exception {
        // Month number must be in range 1-12
        switch (monthNumber) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                throw new Exception();
        }
    }

    public int factorial(int number) throws Exception {
        // Input number must be greater than or equal to 0
        if (number < 0)
            throw new Exception();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
