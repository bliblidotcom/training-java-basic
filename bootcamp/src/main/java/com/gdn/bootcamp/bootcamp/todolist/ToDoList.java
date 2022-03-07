package com.gdn.bootcamp.bootcamp.todolist;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ToDoList {
    List<String> toDoList;

    public ToDoList(){
        toDoList = new ArrayList<>();
    }

    public void validate(String todo){
        if(todo == null) {
            throw new IllegalArgumentException("Invalid Parameter");
        }
    }

    public void add(String todo){
        validate(todo);
        toDoList.add(todo);
    }

    public void remove(String todo){
        validate(todo);
        toDoList.remove(todo);
    }

    public void print(){
        for(String todo: toDoList){
            System.out.println(todo);
        }
    }
}
