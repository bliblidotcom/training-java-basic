package com.gdn.onboarding.java.todolist.service;

import com.gdn.onboarding.java.todolist.model.Todo;

import java.util.Date;
import java.util.Vector;

public interface TodoService {

    public void addTodo(Todo todo);

    public Vector<Todo> getTodos();

    public Todo getTodobyIndex(Integer index);

    public void deleteTodobyIndex(Integer index);

    public void deletebyTodo(Todo todo);
}
