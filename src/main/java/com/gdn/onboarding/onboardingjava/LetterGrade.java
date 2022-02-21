package com.gdn.onboarding.onboardingjava;

import java.util.Scanner;

//Letter-grade : penggunaan IF-ELSE, input angka, output grade
public class LetterGrade {

  public String grading(double nilai) {
    String grade;
    if (nilai >= 85) {
      grade = "A";
    } else if (nilai >= 70) {
      grade = "B";
    } else if (nilai >= 55) {
      grade = "C";
    } else if (nilai >= 40) {
      grade = "D";
    } else {
      grade = "F";
    }
    return grade;
  }
}
