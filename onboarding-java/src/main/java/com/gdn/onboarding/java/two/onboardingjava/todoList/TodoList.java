package com.gdn.onboarding.java.two.onboardingjava.todoList;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<String> todoList = new ArrayList<>();

    public void addTodo(String todo){
        if(todo == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        todoList.add(todo);
    }

    public void removeTodo(String todoRemove){
        if(todoRemove == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        for(int i=0;i<todoList.size();i++){
            if(todoList.get(i).equals(todoRemove)){
                todoList.remove(i);
            }
        }
    }

    public List<String> getTodo(){
//        for(String todo : todoList){
//            System.out.println(todo);
//        }
        return todoList;
    }

//    public TodoList(){
//        addTodo("Makan siang");
//        addTodo("Belajar Java");
//        addTodo("Mengerjakan Project");
//        addTodo("Belajar Maven");
//        getTodo();
//        removeTodo("Makan siang");
//        getTodo();
//        System.out.println("Test");
//    }
//
//    public static void main(String[] args){
//        new TodoList();
//    }
}
