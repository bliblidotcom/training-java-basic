package com.gdn.onboarding.java.two.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("test");
        list.add(1);
        list.add(true);

//        List<String> listString = new ArrayList<>();
//        listString.add("String 1");
//        listString.add("String 2");
//        listString.add("String 10201");

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(1, 100);

        for (Integer value : listInt){
            System.out.println(value);
        }

        System.out.println("Get value of index 1: " + listInt.get(1));
        System.out.println("Get index of value 1: " + listInt.indexOf(1));
        
        

    }
}
