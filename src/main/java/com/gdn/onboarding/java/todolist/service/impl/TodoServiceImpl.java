package com.gdn.onboarding.java.todolist.service.impl;

import com.gdn.onboarding.java.todolist.model.Todo;
import com.gdn.onboarding.java.todolist.service.TodoService;
import org.springframework.stereotype.Service;
import java.util.Vector;

@Service
public class TodoServiceImpl implements TodoService {

    Vector<Todo> todos = new Vector<>();

    public void addTodo(Todo todo){
        todos.add(todo);
    }

    public Vector<Todo> getTodos(){
        return todos;
    }

    public Todo getTodobyIndex(Integer index){
        return todos.get(index);
    }

    public void deleteTodobyIndex(Integer index){
        todos.removeElementAt(index);
    }

    public void deletebyTodo(Todo todo){
        todos.removeElement(todo);
    }
}
