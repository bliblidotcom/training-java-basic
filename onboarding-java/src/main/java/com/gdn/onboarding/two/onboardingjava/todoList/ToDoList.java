package com.gdn.onboarding.two.onboardingjava.todoList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ToDoList {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    ArrayList<String> taskList = new ArrayList<>();

    public ToDoList(ArrayList<String> arr){
        this.taskList = arr;
    }

    public void insert(String input){
        if(input == null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        taskList.add(input);
    }

    public boolean remove(String input){
        if(input == null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        for(int i=0; i<taskList.size() ; i++){
            if(taskList.get(i).equals(input)){
                taskList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printAll(){
        for(int i=1; i<=taskList.size() ; i++){
            logger.info("{}. {}", i, taskList.get(i) );
        }
    }

    public ArrayList<String> getTaskList() {
        return taskList;
    }
}
