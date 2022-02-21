package com.blilbi.onboarding;

public class LetterGrade {
  private final int score;

  public LetterGrade(int score) {
    this.score = score;
  }

  public String getGrade() throws Exception {
    if (score > 100) {
      throw new Exception();
    } else if (score > 89) {
      return "A";
    } else if (score > 79) {
      return "B";
    } else if (score > 69) {
      return "C";
    } else if (score > 59) {
      return "D";
    } else if (score > 49) {
      return "E";
    }else {
      return "F";
    }
  }
}
