package com.gdn.oboarding.java.two.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    public Logger log = LoggerFactory.getLogger(Calculator.class);

    public Calculator() {
        log.error("Error Log");
        log.warn("WARN Log");
        log.info("INFO Log");
        log.debug("DEBUG Log");
        log.trace("TRACE Log");
    }

    private void validate(Integer int1, Integer int2) {
        if(int1 == null || int2 == null) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }
    }

    public Integer add(Integer int1, Integer int2 ) {
        validate(int1, int2);
        return int1 + int2;
    }

    public Integer minus(Integer int1, Integer int2) {
        validate(int1, int2);
        return int1 - int2;
    }

    public Integer multiply(Integer int1, Integer int2) {
        validate(int1, int2);
        return int1*int2;
    }

    public Integer divide(Integer int1, Integer int2) {
        validate(int1, int2);
        return int1/int2;
    }
}
