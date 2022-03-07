package com.gdn.onboarding.java.two.calc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Calculator {

    public Calculator() {
        log.error("ERROR");
        log.warn("WARN");
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("TRACE");
    }

    public Integer add(Integer int1, Integer int2) {
        validate(int1 == null || int2 == null, "Parameters can't be null.");
        return int1 + int2;
    }

    private void validate(boolean int1, String s) {
        if(int1) {
            throw new IllegalArgumentException(s);
        }
    }

    public Integer minus(Integer int1, Integer int2) {
        validate(int1 == null || int2 == null, "Parameters can't be null.");
        return int1 - int2;
    }

    public Integer divide(Integer int1, Integer int2) {
        validate(int1 == null || int2 == null, "Parameters can't be null.");
        validate(int2 == 0, "Divisor can't be zero.");
        return int1 / int2;
    }

    public Integer multiply(Integer int1, Integer int2) {
        validate(int1 == null || int2 == null, "Parameters can't be null.");
        return int1 * int2;
    }
}
