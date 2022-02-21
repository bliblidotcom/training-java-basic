package com.gdn.onboarding.onboardingjava;

import java.util.HashMap;

public class ToDoList {
    HashMap<Integer, String> toDo = new HashMap<Integer, String>();

    protected void addToDo(Integer key, String todo) {
        toDo.put(key, todo);
    }

    protected void removeToDo(Integer key) {
        toDo.remove(key);
    }

    protected void showToDo() {
        System.out.println("My To Do List");
        for (Integer key : toDo.keySet()) {
            System.out.println(key + ". " + toDo.get(key));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo(1, "makan sayur dan minum susu");
        toDoList.addToDo(2, "olahraga pagi dan mandi");
        toDoList.addToDo(3, "belajar dan mencoba hal baru");

        toDoList.showToDo();

        toDoList.removeToDo(2);

        toDoList.showToDo();
    }
}
