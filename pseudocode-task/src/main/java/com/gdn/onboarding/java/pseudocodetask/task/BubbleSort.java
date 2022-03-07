package com.gdn.onboarding.java.pseudocodetask.task;

import org.springframework.stereotype.Service;

@Service
public class BubbleSort {
  public Integer[] sort(Integer[] array) {
    if (array == null) {
      throw new IllegalArgumentException("Parameter cannot be null!");
    }
    for (int i = 0; i < array.length - 1; i++) {
      for (int c = i + 1; c < array.length; c++) {
        if (array[i] > array[c]) {
          Integer temp = array[c];
          array[c] = array[i];
          array[i] = temp;
        }
      }
    }
    return array;
  }
}
