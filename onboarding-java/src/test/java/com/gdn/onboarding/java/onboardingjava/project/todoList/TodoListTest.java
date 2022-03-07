package com.gdn.onboarding.java.onboardingjava.project.todoList;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class TodoListTest {
    private TodoList todo;
    private List<Todo> result;

    @BeforeEach()
    public void init() {
        todo = new TodoList();
        result = new ArrayList<>();
    }

    @Test
    public void getTodo_nullResult_success() {
        result = todo.getAllTodo();
        Assertions.assertEquals(null, result);
    }

    @Test
    public void getTodo_success() {
        todo.addTodo("Nimbun Minyak 2L");
        result = todo.getAllTodo();
        Assertions.assertEquals(1, result.size());
    }

    @Test
    public void addTodo_emptyStringParam_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            todo.addTodo("");
        });
    }

    @Test
    public void addTodo_nullParam_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            todo.addTodo(null);
        });
    }

    @Test
    public void addTodo_success() {
        Boolean result = todo.addTodo("Nimbun Minyak 1L");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void removeTodo_IDNotFound_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            // should mock where id not found
            Integer notFoundID = 10;
            todo.removeTodo(notFoundID);
        });
    }

    @Test
    public void removeTodo_nullParam_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            todo.removeTodo(null);
        });
    }

    @Test
    public void removeTodo_success() {
        todo.addTodo("Nimbun Minyak 1L");
        todo.addTodo("Nimbun Minyak 2L");
        Boolean result = todo.removeTodo(0);
        Assertions.assertEquals(true, result);
    }
}
