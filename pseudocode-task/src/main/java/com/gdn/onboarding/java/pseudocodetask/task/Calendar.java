package com.gdn.onboarding.java.pseudocodetask.task;

import org.springframework.stereotype.Service;

@Service
public class Calendar {
  public String monthAbbr(Integer mo) {
    if (mo == null) {
      throw new IllegalArgumentException("Parameter cannot be null!");
    }
    String month = "Undefined";
    switch (mo) {
      case 1:
        month = "January";
        break;
      case 2:
        month = "February";
        break;
      case 3:
        month = "March";
        break;
      case 4:
        month = "April";
        break;
      case 5:
        month = "May";
        break;
      case 6:
        month = "June";
        break;
      case 7:
        month = "July";
        break;
      case 8:
        month = "August";
        break;
      case 9:
        month = "September";
        break;
      case 10:
        month = "October";
        break;
      case 11:
        month = "November";
        break;
      case 12:
        month = "December";
        break;
      default:
        break;
    }
    return month;
  }
}
