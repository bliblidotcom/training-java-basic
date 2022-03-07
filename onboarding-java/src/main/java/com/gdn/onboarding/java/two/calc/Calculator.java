package com.gdn.onboarding.java.two.calc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Calculator {

    //public Logger log = LoggerFactory.getLogger(Calculator.class);

    public Calculator(){
        log.error("Error log");
        log.warn("Warn log");
        log.info("Info log");
        log.debug("Debug log");
        log.trace("Trace log");
    }

    public Integer add(Integer int1, Integer int2){
        validate(int1, int2);
        return int1 + int2;
    }

    private void validate(Integer int1, Integer int2){
        if (int1 == null || int2 == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
    }

    public Integer minus(Integer int1, Integer int2){
        validate(int1, int2);

        return int1 - int2;
    }

    public Integer multiply(Integer int1, Integer int2){
        validate(int1, int2);

        return int1 * int2;
    }

    public Integer divide(Integer int1, Integer int2){
        validate(int1, int2);

        return int1 / int2;
    }
}
