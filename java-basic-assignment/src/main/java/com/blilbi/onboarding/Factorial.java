package com.blilbi.onboarding;

public class Factorial {

  private int num;

  public Factorial(int num) {
    this.num = num;
  }

  public int getFactorial() {
    for (int i = num - 1; i >= 1; i--) {
      num = num * i;
    }

    return num;
  }
}
