package com.gdn.onboarding.onboardingjava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalenderTest {

  private static final Calender calender = new Calender();

  @Test
  public void successTest() {
    Assert.assertEquals("Januari", calender.namaBulan(1));
    Assert.assertEquals("Februari", calender.namaBulan(2));
    //dst sampai
    Assert.assertEquals("Desember", calender.namaBulan(12));
  }

  private int randomNilai(int min, int max){
    return (int) Math.floor(Math.random()*(max-min+1)+min);
  }

  @Test
  public void failedTest() {
    Assert.assertNotEquals("Januari", calender.namaBulan(randomNilai(2,15)));
    // dst sampai
    Assert.assertNotEquals("Desember", calender.namaBulan(randomNilai(1,11)));
  }
}
