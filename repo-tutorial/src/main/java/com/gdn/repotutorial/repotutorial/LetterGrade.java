package com.gdn.repotutorial.repotutorial;

import java.util.Scanner;

public class LetterGrade {

    public char convertGrade(int num){
        char result = (num >= 90) ? 'A' : (num >= 80) ? 'B' : (num >= 70) ? 'C' : (num >= 60) ? 'D' : 'E';
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Input angka : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        LetterGrade letterGrade = new LetterGrade();
        char result = letterGrade.convertGrade(num);

        System.out.println(result);
    }
}
