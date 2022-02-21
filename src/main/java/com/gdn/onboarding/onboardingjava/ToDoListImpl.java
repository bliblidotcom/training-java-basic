package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.ToDoList;

import java.util.HashMap;
import java.util.Map;

public class ToDoListImpl implements ToDoList {
    int todoId = 0;
    Map<Integer, String> todos = new HashMap<>();

    @Override
    public void getAll() {
        for (Map.Entry<Integer, String> e :
                todos.entrySet()) {
            System.out.println("id: "+e.getKey()+" => " + e.getValue());
        }
    }

    @Override
    public String getById(int id) {
        if (todos.containsKey(id)) return todos.get(id);
        return null;
    }

    @Override
    public int add(String message) {
        todos.put(todoId, message);
        return todoId++;
    }

    @Override
    public boolean update(int id, String message) {
        if (todos.containsKey(id)) {
            todos.put(id, message);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (todos.containsKey(id)) {
            todos.remove(id);
            return true;
        }
        return false;
    }
}
