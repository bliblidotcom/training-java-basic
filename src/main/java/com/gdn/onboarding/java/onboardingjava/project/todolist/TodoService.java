package com.gdn.onboarding.java.onboardingjava.project.todolist;

import java.util.ArrayList;

public class TodoService {
    public static ArrayList<Todo> todos;
    private static TodoService service;

    private TodoService(){
        todos = new ArrayList<>();
        todos.add(new Todo(0,"My Todo"));
    }

    public static TodoService getInstance(){
        if(TodoService.service == null){
            service = new TodoService();
        }
        return service;
    }

    public Todo add(Todo todo){
        todos.add(todo);
        return todo;
    }

    public Todo remove(int id){
        if(id > todos.size()-1 || id < 0){
            return null;
        }
        return todos.remove(id);
    }

    public void removeAll(){
        todos = new ArrayList<>();
    }

    public void print(){
        if(todos.size() == 0){
            System.out.println("No data");
        }
        todos.stream().forEach(todo -> {
            System.out.println("Id : " + todo.getId() + ", Description : " + todo.getDescription());
        });
    }
}
