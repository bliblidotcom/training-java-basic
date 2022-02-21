package com.gdn.onboarding.onboardingjava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FactorialTest {
  private static final Factorial factorial = new Factorial();

  @Test
  public void successTest() {
    Assert.assertEquals(1, factorial.hitung(1));
    Assert.assertEquals(2, factorial.hitung(2));
    //dst sampai
    Assert.assertEquals(120, factorial.hitung(5));
  }

  private int randomNilai(int min, int max){
    return (int) Math.floor(Math.random()*(max-min+1)+min);
  }

  @Test
  public void failedTest() {
    Assert.assertNotEquals(1, factorial.hitung(randomNilai(2,10)));
    // dst sampai
    Assert.assertNotEquals(120, factorial.hitung(randomNilai(1,4)));
  }
}
