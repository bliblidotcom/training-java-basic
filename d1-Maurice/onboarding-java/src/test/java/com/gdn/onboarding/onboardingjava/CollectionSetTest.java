package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetTest {

    @Test
    public void testSet() {
        Set<String> set = new HashSet<>();
        set.add("alfonsus");
        set.add("alfonsus");

        System.out.println(set.size());
    }

}
