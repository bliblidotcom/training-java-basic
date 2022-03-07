package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalendarTest {

    private static final Calendar calendar = new Calendar();

    @Test
    public void testGetMonthName_success(){
        Assertions.assertEquals("January", calendar.getMonthName(1));
    }

    @Test
    public void testGetMonthName_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Assertions.assertEquals("January", calendar.getMonthName(13));
        });
    }
}