package com.gdn.onboarding.java.onboardingjava.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mapStrings = new HashMap<>();
        mapStrings.put("1", "Vincent Low");
        mapStrings.put("2", "Bambang Jamet");
        mapStrings.put("1", "Bambang Jamet");

        for (Map.Entry entry : mapStrings.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
