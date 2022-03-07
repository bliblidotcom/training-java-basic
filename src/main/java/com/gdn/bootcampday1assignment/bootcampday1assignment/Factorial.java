package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class Factorial {

    public Integer getFactorial(Integer num){
        if(num == null){
            throw new IllegalArgumentException("Number must be exist");
        }
        if(num < 0){
            throw new IllegalArgumentException("Number must greater than or equal 0");
        }
        Integer result = 1;
        while(num > 1){
            result*=num;
            num--;
        }
        return result;
    }
}
