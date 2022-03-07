package com.gdn.onboarding.java.onboardingjava.collection;

import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String 1");
        list.add("String 3");
        list.add("String 2");
        list.add(1, "String tambahan di index 1");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
