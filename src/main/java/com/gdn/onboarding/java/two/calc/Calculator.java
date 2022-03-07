package com.gdn.onboarding.java.two.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    public Logger log = LoggerFactory.getLogger(Calculator.class);

    public Calculator() {
        log.info("Created...");
        // log.error("Error Log");
        // log.warn("Warning Log");
        // log.trace("Trace Log");
        // log.debug("Debug Log");
    }

    public void validate(Integer int1, Integer int2) {
        if(int1 == null || int2 == null){
            throw new IllegalArgumentException("Paremeters can not be null!");
        }
    }

    public Integer add(Integer int1, Integer int2) {
        validate(int1, int2);
        return int1 + int2;
    }

    public Integer subtract(Integer int1, Integer int2) {
        validate(int1, int2);
        return int1 - int2;
    }

    public Integer divide(Integer int1, Integer int2) {
        validate(int1, int2);
        if(int2 == 0){
            throw new ArithmeticException("Second Parameter can not be 0!");
        }
        return int1 / int2;
    }

    public Integer multiply(Integer int1, Integer int2) {
        validate(int1, int2);
        return int1 * int2;
    }
}
