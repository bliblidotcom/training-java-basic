package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CollectionMapTest {

    @Test
    public void testMap(){
        Map<Integer, String> intStr = new HashMap<>();
        intStr.put(0, "zero");
        intStr.put(1, "one");
        intStr.put(1, "one-one");

        intStr.put(2, "two");
        intStr.put(3, "three");

//        for(entry:)
        intStr.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
