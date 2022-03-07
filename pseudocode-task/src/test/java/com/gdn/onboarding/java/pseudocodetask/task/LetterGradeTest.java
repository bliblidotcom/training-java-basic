package com.gdn.onboarding.java.pseudocodetask.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LetterGradeTest {

  private final LetterGrade letterGrade = new LetterGrade();

  @Test
  public void testScoreA_success() {
    String result = letterGrade.calculateGrade(90.0);
    Assertions.assertEquals("A", result);
  }

  @Test
  public void testScoreA_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("A", result);
    });
  }
  @Test
  public void testScoreAMinus_success() {
    String result = letterGrade.calculateGrade(83.0);
    Assertions.assertEquals("A-", result);
  }

  @Test
  public void testScoreAMinus_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("A-", result);
    });
  }

  @Test
  public void testScoreBPlus_success() {
    String result = letterGrade.calculateGrade(76.0);
    Assertions.assertEquals("B+", result);
  }

  @Test
  public void testScoreBPlus_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("B+", result);
    });
  }
  @Test
  public void testScoreB_success() {
    String result = letterGrade.calculateGrade(72.0);
    Assertions.assertEquals("B", result);
  }

  @Test
  public void testScoreB_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("B", result);
    });
  }

  @Test
  public void testScoreBMinus_success() {
    String result = letterGrade.calculateGrade(66.0);
    Assertions.assertEquals("B-", result);
  }

  @Test
  public void testScoreBMinus_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("B-", result);
    });
  }
  @Test
  public void testScoreCPlus_success() {
    String result = letterGrade.calculateGrade(63.0);
    Assertions.assertEquals("C+", result);
  }

  @Test
  public void testScoreCPlus_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("C+", result);
    });
  }
  @Test
  public void testScoreC_success() {
    String result = letterGrade.calculateGrade(56.0);
    Assertions.assertEquals("C", result);
  }

  @Test
  public void testScoreC_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("C", result);
    });
  }
  @Test
  public void testScoreD_success() {
    String result = letterGrade.calculateGrade(40.0);
    Assertions.assertEquals("D", result);
  }

  @Test
  public void testScoreD_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("D", result);
    });
  }

  @Test
  public void testScoreE_success() {
    String result = letterGrade.calculateGrade(20.0);
    Assertions.assertEquals("E", result);
  }

  @Test
  public void testScoreE_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = letterGrade.calculateGrade(null);
      Assertions.assertEquals("E", result);
    });
  }
}