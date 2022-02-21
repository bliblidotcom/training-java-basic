package com.gdn.trainingjava.basictraining;

import java.util.Scanner;

public class LetterGradeApplication {
    private final int numericGrade;
    private static final char[] AlphabeticGrade = "ABCD".toCharArray();
    public char grade;

    public LetterGradeApplication(int number) {
        if (number == -404) {
            Scanner input = new Scanner(System.in);
            System.out.print("input grade: ");
            this.numericGrade = input.nextInt();
        } else {
            this.numericGrade = number;
        }
        this.grade = convert();
    }

    private char convert() {
        if (this.numericGrade > 75) {
            return AlphabeticGrade[0];
        } else if (this.numericGrade > 50) {
            return AlphabeticGrade[1];
        } else if(this.numericGrade > 25)  {
            return AlphabeticGrade[2];
        } else if(this.numericGrade > -1) {
            return AlphabeticGrade[3];
        } else {
            return 'z';
        }
    }
    public static void main(String[] args) {
        LetterGradeApplication letter = new LetterGradeApplication(-404);
        System.out.printf("your grade: %c", letter.grade);
    }
}
