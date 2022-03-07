package com.gdn.oboarding.java.two.todolist;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todos = new ArrayList<>();

    public ArrayList<String> create (String todo) {
        todos.add(todo);
        return todos;
    }

    public ArrayList<String> remove(String todo) {
        todos.remove(todo);
        return todos;
    }

    public ArrayList<String> get() {
        return todos;
    }
}
