package com.blilbi.onboarding.javabasicassignment;

import com.blilbi.onboarding.MonthCustomCalendar;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalendarTest {
  
  @Test
  public void showMonth_success() throws Exception {
    MonthCustomCalendar myMonth = new MonthCustomCalendar(1);

    if (myMonth.getMonth() != "Januari") {
      log.error("Test Failed");
      throw new Exception();
    }
  }

  @Test
  public void showMonth_fail() throws Exception {
    MonthCustomCalendar myMonth = new MonthCustomCalendar(1);

    if (myMonth.getMonth() != "Oktober") {
      log.error("Test Failed");
      throw new Exception();
    }
  }
}
