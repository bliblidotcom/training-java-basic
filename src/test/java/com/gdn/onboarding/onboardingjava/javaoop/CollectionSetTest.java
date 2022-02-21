package com.gdn.onboarding.onboardingjava.javaoop;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetTest {

    @Test
    public void testSet(){
        Set<String> setString = new HashSet<>();
        setString.add("tes");
        setString.add("tes");

        System.out.println(setString.size());
        Set<Person> setPerson = new HashSet<>();
    }

    public class Person{
        private String name;

//        @Override
//        public boolean equals(Object o){
//            return true;
//        }
//
//        @Override
//        public int hashCode(){
//            return 1;
//        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }
}
