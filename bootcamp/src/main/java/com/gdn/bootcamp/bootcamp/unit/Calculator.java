package com.gdn.bootcamp.bootcamp.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    public Logger logger = LoggerFactory.getLogger(Calculator.class);

    public Calculator(){
        logger.info("info log");
    }

    public Integer add(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        return a + b;
    }

    public Integer substract(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        return a - b;
    }

    public Integer multiply(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        return a * b;
    }

    public Integer divide(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        if(b == 0){
            throw new IllegalArgumentException("Division by Zero!");
        }
        return a / b;
    }
}
