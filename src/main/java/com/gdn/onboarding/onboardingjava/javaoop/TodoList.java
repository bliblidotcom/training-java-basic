package com.gdn.onboarding.onboardingjava.javaoop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class TodoList {
    //key = date, value = list berisi kegiatan yang ingin dikerjakan
    private Map<String, List<String>> mapTodo = new HashMap<>();
    private Logger log = LoggerFactory.getLogger(TodoList.class);

    public Map<String, List<String>> getMapTodo(){
        return this.mapTodo;
    }

    public void addDate(String date) throws Exception {       //date masih string agar lebih mudah
        if(!mapTodo.containsKey(date)){
            List<String> newTodoList = new ArrayList<>();
            mapTodo.put(date, newTodoList);
        }
        else {
            log.error("Date is exist");
            throw new Exception("Date is exist");
        }
    }

    public void addTodo(String date, String... todo) throws Exception {
        if(mapTodo.containsKey(date)){
            mapTodo.get(date).addAll(Arrays.asList(todo));
        }
        else {
            log.error("Date doesn't exist");
            throw new Exception("Date doesn't exist");
        }
    }

    public void removeDate(String date) throws Exception {
        if(mapTodo.containsKey(date)){
            mapTodo.remove(date);
        }
        else {
            log.error("Date doesn't exist");
            throw new Exception("Date doesn't exist");
        }
    }

    public void removeTodo(String date, String todo) throws Exception {
        if(mapTodo.containsKey(date)){
            mapTodo.get(date).remove(todo);
        }
        else {
            log.error("Date doesn't exist");
            throw new Exception("Date doesn't exist");
        }
    }
}
