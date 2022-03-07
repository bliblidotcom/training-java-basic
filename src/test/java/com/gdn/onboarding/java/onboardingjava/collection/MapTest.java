package com.gdn.onboarding.java.onboardingjava.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mapStringString = new HashMap<>();
        mapStringString.put("key 1", "value 1");
        mapStringString.put("key 2", "value 2");

        for (Map.Entry entry : mapStringString.entrySet()){
            System.out.println(entry.getKey()+"-"+ entry.getValue());
        }

        System.out.println(mapStringString.get("key 1"));
    }
}
