package com.gdn.onboarding.java.two.collection;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> setInt = new HashSet<>();
        setInt.add(3);
        setInt.add(1);
        setInt.add(12);
        setInt.add(6);

        for (Integer integer: setInt) {
            System.out.println(integer);
        }
    }

    private static void setHuman() {
        Set<Human> setHuman = new HashSet<>();
        Human humanA = new Human();
        humanA.setId(1);
        humanA.setName("Alfons");
        setHuman.add(humanA);

        Human humanB = new Human();
        humanB.setId(2);
        humanB.setName("Budi");
        setHuman.add(humanB);

        Human humanC = new Human();
        humanC.setId(1);
        humanC.setName("Budi");
        setHuman.add(humanC);

        for (Human human: setHuman) {
            System.out.println(human.getId());
            System.out.println(human.getName());
        }
    }

    private static void setString() {
        Set<String> setStr = new HashSet<>();
        setStr.add("string");
        setStr.add("String");
        setStr.add("string");

        for (String str: setStr) {
            System.out.println(str);
        }
    }

    @Data
    public static class Human {
        private Integer id;
        private String name;
    }
}
