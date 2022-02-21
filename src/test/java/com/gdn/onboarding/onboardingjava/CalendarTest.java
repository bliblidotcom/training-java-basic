package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class CalendarTest {
    @Test
    public void testGetMonth_success() throws Exception{
        String tc = new Calendar().getMonth(10);
        if (!tc.equals("October")) {
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

}
