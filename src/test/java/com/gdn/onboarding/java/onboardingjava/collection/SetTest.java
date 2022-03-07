package com.gdn.onboarding.java.onboardingjava.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Human> setHuman = new HashSet<>();


        Human human = new Human();
        human.setId("1");
        human.setName("andrew");
        setHuman.add(human);


        for (Human hmn : setHuman){
            System.out.println(hmn.getName());
        }


    }

    private static void setString(){
        Set<String> setStr = new HashSet<>();
        setStr.add("string");
        setStr.add("String");
        setStr.add("string");


        for (String str : setStr){
            System.out.println(str);
        }
    }

    public static class Human{
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
