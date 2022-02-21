package com.gdn.onboarding.onboardingjava.javaoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tugas {
    public int factorial(int n){
        if(n <= 0){
            return -1;
        }
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public String calender(int n){
        switch (n){
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
                return "Invalid input";
        }
    }

    public String letterGrade(int grade){
        if(grade < 0 || grade > 100){
            return null;
        }
        String letter;
        if(grade >= 85){
            letter = "A";
        }
        else if(grade >= 80){
            letter = "A-";
        }
        else if(grade >= 75){
            letter = "B+";
        }
        else if(grade >= 70){
            letter = "B";
        }
        else if(grade >= 65){
            letter = "B-";
        }
        else if(grade >= 60){
            letter = "C+";
        }
        else if(grade >= 55){
            letter = "C";
        }
        else if(grade >= 50){
            letter = "C-";
        }
        else if(grade >= 45){
            letter = "D";
        }
        else{
            letter = "E";
        }

        return letter;
    }
}
