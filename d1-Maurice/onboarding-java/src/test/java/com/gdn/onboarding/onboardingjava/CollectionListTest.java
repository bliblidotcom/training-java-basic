package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionListTest {

    @Test
    public <T extends Object> void testList() {
        List<String> list = new ArrayList<>();
        list.add("string");
        list.add("alfonsus");
        list.add("alfonsus");

        list.add(2, "sisipan");

        for (String str : list) {
            System.out.println(str);
        }

        list.remove("alfonsus");
        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }

    }
}
