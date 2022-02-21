package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LettergradeTest {

    @Test
    public void testGetGrade_success() throws Exception {
        assertEquals('A', new Lettergrade().getGrade(100));
    }

    @Test
    public void testGetGrade_success1() throws Exception {
        assertEquals('B', new Lettergrade().getGrade(76));
    }

    @Test
    public void testGetGrade_fail() throws Exception {
        assertNotEquals('B', new Lettergrade().getGrade(81));
    }

    @Test
    public void testGetGrade_exception() throws Exception {
        assertThrows(Exception.class, () -> new Lettergrade().getGrade(-5));
    }

    @Test
    public void testGetGrade_exception1() throws Exception {
        assertThrows(Exception.class, () -> new Lettergrade().getGrade(106));
    }


}
