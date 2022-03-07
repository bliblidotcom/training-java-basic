package com.gdn.onboarding.java.pseudocodetask.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
  private final Factorial factorial = new Factorial();

  @Test
  public void test5Factorial_success() {
    Integer result = factorial.count(5);
    Assertions.assertEquals(120, result);
  }

  @Test
  public void test5Factorial_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Integer result = factorial.count(null);
      Assertions.assertEquals(120, result);
    });
  }


}