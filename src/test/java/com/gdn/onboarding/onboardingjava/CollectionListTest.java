package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionListTest {

    @Test
    public <T> void testList(){
        List<String> list = new ArrayList<>();
        list.add("Satu");
        list.add("Dua");
        list.add("Tiga");

        System.out.println(list.size());

        list.add(2,"nyelip");
        for (String str: list
             ) {
            System.out.println(str);
        }

        list.remove(2);
        for (String str: list
        ) {
            System.out.println(str);
        }
    }
}
