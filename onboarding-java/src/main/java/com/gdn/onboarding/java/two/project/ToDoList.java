package com.gdn.onboarding.java.two.project;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ToDoList {
    private List<String> list;

    public ToDoList() {
        list = new ArrayList<>();
    }

    public void add(String value) {
        if(value == null) throw new IllegalArgumentException("Parameter value must not be null.");
        list.add(value);
    }

    public void remove(String value) {
        if(value == null) throw new IllegalArgumentException("Parameter value must not be null.");
        list.remove(value);
    }

    public void print() {
        list.stream().forEach(string -> System.out.println(string));
    }
}
