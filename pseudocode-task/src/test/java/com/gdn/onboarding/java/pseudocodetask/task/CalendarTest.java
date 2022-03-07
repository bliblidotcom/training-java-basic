package com.gdn.onboarding.java.pseudocodetask.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalendarTest {
  private final Calendar calendar = new Calendar();

  @Test
  public void testMonthJanuary_success() {
    String result = calendar.monthAbbr(1);
    Assertions.assertEquals("January", result);
  }

  @Test
  public void testMonthJanuary_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("January", result);
    });
  }

  @Test
  public void testMonthFebruary_success() {
    String result = calendar.monthAbbr(2);
    Assertions.assertEquals("February", result);
  }

  @Test
  public void testMonthFebruary_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("February", result);
    });
  }

  @Test
  public void testMonthMarch_success() {
    String result = calendar.monthAbbr(3);
    Assertions.assertEquals("March", result);
  }

  @Test
  public void testMonthMarch_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("March", result);
    });
  }

  @Test
  public void testMonthApril_success() {
    String result = calendar.monthAbbr(4);
    Assertions.assertEquals("April", result);
  }

  @Test
  public void testMonthApril_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("April", result);
    });
  }

  @Test
  public void testMonthMay_success() {
    String result = calendar.monthAbbr(5);
    Assertions.assertEquals("May", result);
  }

  @Test
  public void testMonthMay_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("May", result);
    });
  }

  @Test
  public void testMonthJune_success() {
    String result = calendar.monthAbbr(6);
    Assertions.assertEquals("June", result);
  }

  @Test
  public void testMonthJune_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("June", result);
    });
  }

  @Test
  public void testMonthJuly_success() {
    String result = calendar.monthAbbr(7);
    Assertions.assertEquals("July", result);
  }

  @Test
  public void testMonthJuly_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("July", result);
    });
  }

  @Test
  public void testMonthAugust_success() {
    String result = calendar.monthAbbr(8);
    Assertions.assertEquals("August", result);
  }

  @Test
  public void testMonthAugust_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("August", result);
    });
  }

  @Test
  public void testMonthSeptember_success() {
    String result = calendar.monthAbbr(9);
    Assertions.assertEquals("September", result);
  }

  @Test
  public void testMonthSeptember_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("September", result);
    });
  }

  @Test
  public void testMonthOctober_success() {
    String result = calendar.monthAbbr(10);
    Assertions.assertEquals("October", result);
  }

  @Test
  public void testMonthOctober_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("October", result);
    });
  }

  @Test
  public void testMonthNovember_success() {
    String result = calendar.monthAbbr(11);
    Assertions.assertEquals("November", result);
  }

  @Test
  public void testMonthNovember_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("November", result);
    });
  }

  @Test
  public void testMonthDecember_success() {
    String result = calendar.monthAbbr(12);
    Assertions.assertEquals("December", result);
  }

  @Test
  public void testMonthDecember_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      String result = calendar.monthAbbr(null);
      Assertions.assertEquals("December", result);
    });
  }
}