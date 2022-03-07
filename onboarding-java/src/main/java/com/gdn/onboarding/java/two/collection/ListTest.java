package com.gdn.onboarding.java.two.collection;

import com.gdn.onboarding.java.two.onboardingjava.OnboardingJavaApplication;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(1);
        listInt.add(2);

        for (Integer Int: listInt) {
            System.out.println(Int);
        }
    }
}
