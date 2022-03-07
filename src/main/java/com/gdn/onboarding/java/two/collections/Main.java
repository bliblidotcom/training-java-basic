package com.gdn.onboarding.java.two.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Human<String> human = new Human<>();
        Human<Integer> human1 = new Human<>();

        human.setData("string");
        human1.setData(5);
    }

    public static void mapTest() {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("key1", "value1");
        stringStringMap.put("key1", "value2");
        stringStringMap.put("key2", "value3");

        for(Map.Entry entry : stringStringMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(stringStringMap.get("key1"));
    }

    public static void sortedSetTest() {
        // Set emang berurutan, tapi tidak reliable
        // SortedSet lebih reliable kalo butuh yang berurutan

        SortedSet<Integer> integerSortedSet = new TreeSet<>();
    }

    public static void humanSetTest() {
        Set<Human> humanSet = new HashSet<>();

        Human human1 = new Human();
        human1.setId(1);
        human1.setName("Ali");

        Human human2 = new Human();
        human2.setId(2);
        human2.setName("Adi");

        Human human3 = new Human();
        human3.setName("Adi");
        human3.setId(2);

        humanSet.add(human1);
        humanSet.add(human2);
        humanSet.add(human3);

        for(Human human : humanSet) {
            System.out.println(human.getId() + " " + human.getName());
        }
    }

    public static void setTest() {
        // Set ini isinya harus unik, tidak bisa ada duplikasi
        // Menggunakan HashSet karena isinya ini unique

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(1);
        integerSet.add(23);
        integerSet.add(15);
        integerSet.add(1);

        for(int value : integerSet){
            System.out.println(value);
        }
    }

    public static void listTest() {
        // di awal menggunakan Interfacenya, untuk Instansiasinya
        // menggunakan class-nya

        // Generic itu yang ada di dalem kurung < >

        // di List atau Collection itu ngga ada batasnya kyk Array
        // kalo tiba-tiba ditambahin lagi isinya, maka akan dilakukan
        // intansiasi array baru dan isinya diduplikasi :)

        List<String> stringList = new ArrayList<>();
        stringList.add("Halo");
        stringList.add("Hello");
        stringList.add(1, "Hi");
        stringList.add("Hai");

        for(String str : stringList){
            System.out.println(str);
        }

        System.out.println(stringList.get(3));
    }

    public static class Human<T> {
        private String name;
        private Integer id;
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return Objects.equals(name, human.name) && Objects.equals(id, human.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }
}
