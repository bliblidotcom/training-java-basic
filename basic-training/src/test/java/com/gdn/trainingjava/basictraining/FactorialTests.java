package com.gdn.trainingjava.basictraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTests {
    @Test
    public void FactorialTest() {
        FactorialApplication factor = new FactorialApplication(10);
        Assertions.assertEquals(factor.factRes, 3628800);
    }
}
