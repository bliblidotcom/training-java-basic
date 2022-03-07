package com.gdn.onboarding.java.pseudocodetask.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  private final BubbleSort bubbleSort = new BubbleSort();

  @Test
  public void bubbleSort_success() {
    Integer[] array = {5, 2, 8, 3, 1};
    Integer[] sortedArray = {1, 2, 3, 5, 8};
    Integer[] result = bubbleSort.sort(array);
    Assertions.assertArrayEquals(sortedArray, result);
  }


  @Test
  public void bubbleSort_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Integer[] sortedArray = {1, 2, 3, 5, 8};
      Integer[] result = bubbleSort.sort(null);
      Assertions.assertArrayEquals(sortedArray, result);
    });
  }
}