package com.gdn.onboarding.java.onboardingjava.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("string");
        list.add(1);
        list.add(true);

        List<String> listStr = new ArrayList<>();
        listStr.add("String 3");
        listStr.add("String 1");
        listStr.add("String 2");

        for (String str : listStr){
            System.out.println(str);
        }

        System.out.println(listStr.indexOf("String 2"));
    }
}
