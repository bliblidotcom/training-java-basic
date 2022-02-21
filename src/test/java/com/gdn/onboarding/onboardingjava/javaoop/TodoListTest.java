package com.gdn.onboarding.onboardingjava.javaoop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoListTest {
    private TodoList todo = new TodoList();
    private Logger log = LoggerFactory.getLogger(TodoListTest.class);
    private String DATE_VALUE = "21 Februari 2022";
    private List<String> TODO_LIST = new ArrayList<>(Arrays.asList("Do Homework", "Coding", "Games"));
    
    @Test
    public void addDateTest_success() throws Exception {
        todo.addDate(DATE_VALUE);
        Assertions.assertEquals(true, todo.getMapTodo().containsKey(DATE_VALUE));
    }

    @Test
    public void addDateTest_failed() throws Exception {
        todo.addDate(DATE_VALUE);
        todo.addDate(DATE_VALUE);       //date is exist and throw exception
    }

    @Test
    public void addTodoTest_success() throws Exception {
        todo.addDate(DATE_VALUE);
        todo.addTodo(DATE_VALUE, "Do Homework", "Coding", "Games");
        Assertions.assertEquals(TODO_LIST, todo.getMapTodo().get(DATE_VALUE));
    }

    @Test
    public void addTodoTest_failed() throws Exception {
        todo.addTodo(DATE_VALUE, "Do Homework", "Coding", "Games");     //throw error (tidak ada date)
    }

    @Test
    public void removeDateTest_success() throws Exception {
        todo.addDate(DATE_VALUE);
        todo.removeDate(DATE_VALUE);
        Assertions.assertEquals(false, todo.getMapTodo().containsKey(DATE_VALUE));
    }

    @Test
    public void removeDateTest_failed() throws Exception {
        todo.removeDate(DATE_VALUE);        //throw error (tidak ada date)
    }

    @Test
    public void removeTodoTest_success() throws Exception {
        todo.addDate(DATE_VALUE);
        todo.addTodo(DATE_VALUE, "Do Homework", "Coding", "Games");
        todo.removeTodo(DATE_VALUE, "Games");
        TODO_LIST.remove("Games");
        Assertions.assertEquals(false, todo.getMapTodo().get(DATE_VALUE).contains("Games"));
        Assertions.assertEquals(TODO_LIST, todo.getMapTodo().get(DATE_VALUE));
    }

    @Test
    public void removeTodoTest_failed() throws Exception {
        todo.removeTodo(DATE_VALUE, "Games");       //throw error (tidak ada date)
    }
}
