package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalendarTest {

    @Test
    public void testGetBulan_success() throws Exception {
        assertEquals("MARET", new Calendar().getBulan(3));
    }

    @Test
    public void testGetBulan_success1() throws Exception {
        assertEquals("DESEMBER", new Calendar().getBulan(12));
    }

    @Test
    public void testGetBulan_fail() throws Exception {
        assertNotEquals("JANUARI", new Calendar().getBulan(2));
    }

    @Test
    public void testGetBulan_exception() throws Exception {
        assertThrows(Exception.class, () -> new Calendar().getBulan(14));
    }

    @Test
    public void testGetBulan_exception2() throws Exception {
        assertThrows(Exception.class, () -> new Calendar().getBulan(-2));
    }


}
