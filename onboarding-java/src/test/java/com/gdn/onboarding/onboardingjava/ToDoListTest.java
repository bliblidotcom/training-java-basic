package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoListTest {

    @Test
    public void testAddToDo_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("first todo");
        toDoList.addToDo("second todo");
        Assertions.assertEquals(2, toDoList.todos.size());
        Assertions.assertEquals(true, toDoList.todos.containsValue("first todo"));
        Assertions.assertEquals(true, toDoList.todos.containsValue("second todo"));
    }

    @Test
    public void testGetToDoAll_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("first todo");
        toDoList.addToDo("second todo");
        toDoList.getToDoAll();
        Assertions.assertEquals(2, toDoList.todos.size());
    }

    @Test
    public void testGetToDoByID_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("first todo");
        toDoList.addToDo("second todo");
        String todo = toDoList.getToDoByID(1);
        Assertions.assertNotNull(todo);
    }

    @Test
    public void testGetToDoByID_failed() {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("first todo");
        toDoList.addToDo("second todo");
        String todo = toDoList.getToDoByID(99);
        Assertions.assertNull(todo);
    }

    @Test
    public void testUpdateToDo_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("first todo");
        toDoList.addToDo("second todo");
        toDoList.updateToDo(2, "update second todo");
        Assertions.assertEquals(2, toDoList.todos.size());
        Assertions.assertEquals(true, toDoList.todos.containsValue("update second todo"));
    }

    @Test
    public void testDeleteToDo_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("first todo");
        toDoList.addToDo("second todo");
        toDoList.deleteToDo(1);
        Assertions.assertEquals(1, toDoList.todos.size());
        Assertions.assertEquals(false, toDoList.todos.containsKey(1));
        Assertions.assertEquals(true, toDoList.todos.containsKey(2));
    }

}
