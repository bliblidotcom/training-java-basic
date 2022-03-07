package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Component
public class BubbleSort {

    public Integer[] sort(@Nullable Integer[] numList) {
        for (int i = 0; i < numList.length - 1; i++) {
            for (int j = 0; j < numList.length - i - 1; j++) {
                if (numList[j] > numList[j + 1]) {
                    Integer temp = numList[j];
                    numList[j] = numList[j+1];
                    numList[j+1] = temp;
                }
            }
        }
        return numList;
    }
}
