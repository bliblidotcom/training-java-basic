package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testGetFactorialValue_success() throws Exception {
        assertEquals(120, new Factorial().getFactorialValue(5));
    }


    @Test
    public void testGetFactorialValue_success1() throws Exception {
        assertEquals(720, new Factorial().getFactorialValue(6));
    }

    @Test
    public void testGetFactorialValue_fail() throws Exception {
        assertNotEquals(6, new Factorial().getFactorialValue(4));
    }

    @Test
    public void testGetFactorialValue_exception() throws Exception {
        assertThrows(Exception.class, () -> new Factorial().getFactorialValue(-5));
    }

}
