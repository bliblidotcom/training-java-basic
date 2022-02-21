package com.gdn.onboarding.onboardingjava;

import java.util.HashMap;
import java.util.Map;

public class ToDoList {
    Map<Integer, String> todos = new HashMap<>();
    int id_todo = 1;

    public void addToDo(String todo) {
        todos.put(id_todo, todo);
        id_todo++;
    }

    public void getToDoAll() {
        for (Map.Entry<Integer, String> e : todos.entrySet()) {
            System.out.println("ID " + e.getKey() + ": " + e.getValue());
        }
    }

    public String getToDoByID(int id) {
        if(todos.containsKey(id)) return todos.get(id);
        return null;
    }

    public void updateToDo(int id, String todo) {
        if(todos.containsKey(id)) todos.put(id, todo);
        else System.out.println("No ToDo with ID " + id);
    }

    public void deleteToDo(int id) {
        if(todos.containsKey(id)) todos.remove(id);
        else System.out.println("No ToDo with ID " + id);
    }
}
