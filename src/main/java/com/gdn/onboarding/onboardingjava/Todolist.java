package com.gdn.onboarding.onboardingjava;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Todolist {

    private List<String> todolist;
    private List<Boolean> todolistStatus;

    public Todolist() {
        todolist = new ArrayList<>();
        todolistStatus = new ArrayList<>();
    }

    public void addTodo(String task) {
        todolist.add(task);
        todolistStatus.add(false);
    }

    public void doneTodo(String task) {
        for (int i = 0; i < todolist.size(); i++)
            if (todolist.get(i).compareTo(task) == 0)
                todolistStatus.set(i, true);
    }

    public void clearDone() {
        List<String> todolist_temp = new ArrayList<>();
        List<Boolean> todolistStatus_temp = new ArrayList<>();

        for (int i = 0; i < todolist.size(); i++)
            if (!todolistStatus.get(i)) {
                todolist_temp.add(todolist.get(i));
                todolistStatus_temp.add(false);
            }
        setTodolist(todolist_temp);
        setTodolistStatus(todolistStatus_temp);
    }

    public List<String> getTodolist() {
        return todolist;
    }

    public void setTodolist(List<String> todolist) {
        this.todolist = todolist;
    }

    public List<Boolean> getTodolistStatus() {
        return todolistStatus;
    }

    public void setTodolistStatus(List<Boolean> todolistStatus) {
        this.todolistStatus = todolistStatus;
    }
}
