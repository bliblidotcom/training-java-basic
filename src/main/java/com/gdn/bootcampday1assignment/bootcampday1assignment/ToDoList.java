package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Component
public class ToDoList {

    private Set<String> todoList = new HashSet<>();

    public void add(@Nullable String message){
        if(message == null){
            throw new IllegalArgumentException("Message must be exist");
        }
        todoList.add(message);
    }

    public boolean remove(@Nullable String message){
        if(message == null){
            throw new IllegalArgumentException("Index must be exist");
        }
        if(todoList.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Todo list empty");
        }
        return todoList.remove(message);
    }

    public boolean print(){
        System.out.println("To Do List");
        for (String todo:
             todoList) {
            System.out.println(todo);
        }
        return true;
    }
}
