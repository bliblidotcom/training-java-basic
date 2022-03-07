package com.gdn.onboarding.java.two.collection;

import lombok.Data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Human> setHuman = new HashSet<>();

        Human humanA = new Human();
        humanA.setId(1);
        humanA.setName("Axa");
        setHuman.add(humanA);

        Human humanB = new Human();
        humanB.setId(2);
        humanB.setName("Bxb");
        setHuman.add(humanB);

        for (Human human : setHuman){
            System.out.println(human.getId());
            System.out.println(human.getName());
        }

        Set<Integer> setInt = new HashSet<>();
        setInt.add(3);
        setInt.add(1);
        setInt.add(12);
        setInt.add(6);

        for (Integer integer : setInt){
            System.out.println(integer);
        }
    }

    private static void setString(){
        Set<String> setStr = new HashSet<>();
        setStr.add("String");
        setStr.add("axa");
        setStr.add("ada");

        for (String str : setStr){
            System.out.println(str);
        }
    }

    public static class Employee extends Human{

    }

    public static class Manager extends Human{

    }

    @Data
    public static class Human<T>{
        private Integer id;
        private String name;
        private T data; //generic

//        public T getData() {
//            return data;
//        }
//
//        public void setData(T data) {
//            this.data = data;
//        }

        @Override
        public int hashCode(){
            return 1;
        }

        @Override
        public boolean equals(Object obj){
            if (this == obj){
                return true;
            }
            if(obj == null || getClass() != obj.getClass()){
                return false;
            }

            Human human = (Human) obj;
            return Objects.equals(id,human.id);
        }

//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
    }

}
