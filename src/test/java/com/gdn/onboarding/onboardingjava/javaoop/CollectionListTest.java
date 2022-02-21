package com.gdn.onboarding.onboardingjava.javaoop;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CollectionListTest {

    private Logger log = LoggerFactory.getLogger(CollectionListTest.class);

    @Test
    public <T> void testList(){
        List<String> list = new ArrayList();
        list.add("Mario");
        list.add("Claudius");

        log.info(list.size() + "");
        log.info("INFO list.size(): {}", list.size());
        System.out.println(list.size());
        list.add(1, "Test");

        for(String s : list){
            System.out.println(s);
        }
    }
}
