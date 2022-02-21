package com.gdn.trainingjava.basictraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTests {
    @Test
    public void ConvertTest() {
        CalendarApplication calendar = new CalendarApplication(12);
        Assertions.assertEquals(calendar.monthInString, "December");
    }
}
