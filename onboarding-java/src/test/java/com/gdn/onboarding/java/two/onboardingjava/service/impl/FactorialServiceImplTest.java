package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialServiceImplTest {
    FactorialServiceImpl factorialService;

    @BeforeEach
    void setUp() {
        factorialService = new FactorialServiceImpl();
    }

    @Test
    void testCountByLoop_success() {
        Assertions.assertEquals(720, factorialService.countByLoop(6));
        Assertions.assertEquals(factorialService.countByRecursive(6), factorialService.countByLoop(6));
    }

    @Test
    void testCountByLoop_failed() {
        Assertions.assertNotEquals(120, factorialService.countByLoop(6));

    }

    @Test
    void testCountByRecursive_success() {
        Assertions.assertEquals(factorialService.countByLoop(6), factorialService.countByRecursive(6));
    }

    @Test
    void testCountByRecursive_failed() {
        Assertions.assertNotEquals(120, factorialService.countByRecursive(6));
    }
}