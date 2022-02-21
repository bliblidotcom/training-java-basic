package com.blilbi.onboarding.javabasicassignment;

import com.blilbi.onboarding.LetterGrade;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LetterGradeTest {
  
  @Test
  public void showGrade_success() throws Exception {
    LetterGrade myScore = new LetterGrade(89);

    if (myScore.getGrade() != "B") {
      log.error("Test Failed");
      throw new Exception();
    }
  }

  @Test
  public void showGrade_fail() throws Exception {
    LetterGrade myScore = new LetterGrade(89);

    if (myScore.getGrade() != "A") {
      log.error("Test Failed");
      throw new Exception();
    }
  }
}
