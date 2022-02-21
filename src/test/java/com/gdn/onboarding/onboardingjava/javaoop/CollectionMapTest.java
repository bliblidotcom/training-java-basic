package com.gdn.onboarding.onboardingjava.javaoop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CollectionMapTest {

    @Test
    public void testMap(){
        Map<Integer, String> intStr = new HashMap<>();
        intStr.put(0, "zero");
        intStr.put(1, "one");

        intStr.forEach((k,v) -> System.out.println("Key: " + k + ", value: " + v));

        for(Map.Entry entry : intStr.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
