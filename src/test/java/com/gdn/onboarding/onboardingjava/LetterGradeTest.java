package com.gdn.onboarding.onboardingjava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LetterGradeTest {
  private static final LetterGrade letter = new LetterGrade();

  @Test
  public void successTest() {
    Assert.assertEquals("A", letter.grading(87));
    Assert.assertEquals("B", letter.grading(76.7));
    //dst sampai
    Assert.assertEquals("F", letter.grading(5));
  }

  private int randomNilai(int min, int max){
    return (int) Math.floor(Math.random()*(max-min+1)+min);
  }

  @Test
  public void failedTest() {
    Assert.assertNotEquals("F", letter.grading(randomNilai(25,100)));
    // dst sampai
    Assert.assertNotEquals("A", letter.grading(randomNilai(0,84)));
  }
}
