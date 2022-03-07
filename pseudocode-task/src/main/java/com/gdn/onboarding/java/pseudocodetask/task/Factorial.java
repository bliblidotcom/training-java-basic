package com.gdn.onboarding.java.pseudocodetask.task;

import org.springframework.stereotype.Service;

@Service
public class Factorial {
  public Integer count(Integer val) {
    if (val == null) {
      throw new IllegalArgumentException("Parameter cannot be null!");
    }
    if (val != 1) {
      Integer newVal = val - 1;
      return val * count(newVal);
    } else {
      return 1;
    }
  }
}
