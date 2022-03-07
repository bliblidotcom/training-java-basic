package com.gdn.onboarding.java.onboardingjava.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Human<String> human = new Human<>();
        human.setId(100);
        human.setName("Vincent Low");
        human.setData("Ini data generic");

//        System.out.println(human.getData());
        setHumans();
    }

    private static void setHumans() {
        Set<Human> setHumans = new HashSet<>();

        Human a = new Human();
        a.setId(1);
        a.setName("Vincent");
        setHumans.add(a);

        Human b = new Human();
        b.setId(2);
        b.setName("Wow");
        setHumans.add(b);

//        for (Human human : setHumans) {
//            System.out.println(human.getId() + " " + human.getName());
//        }

        setHumans.stream().forEach(h -> {
            System.out.println(h.getId());
            System.out.println(h.getName());
        });
    }

    private static void setStrings() {
        Set<String> setStr = new HashSet<>();
        setStr.add("String 01");
        setStr.add("String 03");
        setStr.add("String 04");
        setStr.add("String 02");
        setStr.add("String 04");

        for (String str : setStr) {
            System.out.println(str);
        }
    }

    public static class Human<T> {
        private Integer id;
        private String name;
        private T data;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
