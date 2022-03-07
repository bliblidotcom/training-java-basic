package com.gdn.onboarding.two.onboardingjava.todoList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    public void testAdd_success(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("cooking");
        arr.add("cleaning");
        arr.add("playing");
        ToDoList toDoList = new ToDoList(arr);
        toDoList.insert("coding");
        String answer = toDoList.getTaskList().get(toDoList.taskList.size()-1);
        assertEquals("coding", answer);
    }

    @Test
    public void testAddSize_success(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("cooking");
        arr.add("cleaning");
        arr.add("playing");
        ToDoList toDoList = new ToDoList(arr);
        toDoList.insert("coding");
        Integer answer = toDoList.taskList.size();
        assertEquals(4, answer);
    }

    @Test
    public void testAdd_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            ArrayList<String> arr = new ArrayList<>();
            arr.add("cooking");
            arr.add("cleaning");
            arr.add("playing");
            ToDoList toDoList = new ToDoList(arr);
            toDoList.insert(null);
            String answer = toDoList.getTaskList().get(toDoList.taskList.size()-1);
            assertEquals("coding", answer);
        });
    }



    @Test
    public void testRemove_success(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("cooking");
        arr.add("cleaning");
        arr.add("playing");
        ToDoList toDoList = new ToDoList(arr);
        toDoList.remove("playing");
        String answer = toDoList.getTaskList().get(toDoList.taskList.size()-1);
        assertEquals("cleaning", answer);
    }

    @Test
    public void testRemoveSize_success(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("cooking");
        arr.add("cleaning");
        arr.add("playing");
        ToDoList toDoList = new ToDoList(arr);
        toDoList.remove("playing");
        Integer answer = toDoList.taskList.size();
        assertEquals(2, answer);
    }

    @Test
    public void testRemove_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            ArrayList<String> arr = new ArrayList<>();
            arr.add("cooking");
            arr.add("cleaning");
            arr.add("playing");
            ToDoList toDoList = new ToDoList(arr);
            toDoList.remove(null);
            String answer = toDoList.getTaskList().get(toDoList.taskList.size()-1);
            assertEquals("cleaning", answer);
        });
    }
}