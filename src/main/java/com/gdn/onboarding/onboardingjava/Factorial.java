package com.gdn.onboarding.onboardingjava;

public class Factorial {

  public long hitung(int nilai) {
    long res = 1;
    long i = 1;
    while (i <= nilai) {
      res *= i;
      i++;
    }
    return res;
  }
}
