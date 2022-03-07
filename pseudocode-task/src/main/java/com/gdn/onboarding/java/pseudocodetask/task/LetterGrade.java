package com.gdn.onboarding.java.pseudocodetask.task;

import org.springframework.stereotype.Service;

@Service
public class LetterGrade {
  public String calculateGrade(Double score) {
    if (score == null) {
      throw new IllegalArgumentException("Parameter cannot be null!");
    }
    if (score >= 85) {
      return "A";
    } else if (score >= 80) {
      return "A-";
    } else if (score >= 75) {
      return "B+";
    } else if (score >= 70) {
      return "B";
    } else if (score >= 65) {
      return "B-";
    } else if (score >= 60) {
      return "C+";
    } else if (score >= 55) {
      return "C";
    } else if (score >= 40) {
      return "D";
    }
    return "E";

  }
}
