package com.blilbi.onboarding.javabasicassignment;

import com.blilbi.onboarding.Factorial;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactorialTest {
  
  @Test
  public void showFactorial_success() throws Exception {
    Factorial myFactorial = new Factorial(6);

    if (myFactorial.getFactorial() != 720) {
      log.error("Test Failed");
      throw new Exception();
    }
  }

  @Test
  public void showFactorial_fail() throws Exception {
    Factorial myFactorial = new Factorial(6);

    if (myFactorial.getFactorial() != 10) {
      log.error("Test Failed");
      throw new Exception();
    }
  }
}
