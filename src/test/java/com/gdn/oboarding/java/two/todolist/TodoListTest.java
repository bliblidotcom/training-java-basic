package com.gdn.oboarding.java.two.todolist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    private final TodoList todolist = new TodoList();

    @Test
    public void testCreate_success() {
        ArrayList<String> expectedTodos = new ArrayList<>();
        expectedTodos.add("Do some homework");
        ArrayList<String> todos = todolist.create("Do some homework");
        Assertions.assertEquals(todos, expectedTodos);
    }

    @Test
    public void testCreate_failed() {
        ArrayList<String> expectedTodos = new ArrayList<>();
        expectedTodos.add("Do some");
        ArrayList<String> todos = todolist.create("Do some homework");
        Assertions.assertNotEquals(todos, expectedTodos);
    }

    @Test
    public void testRemove() {
        ArrayList<String> expectedTodos = new ArrayList<>();
        todolist.create("Do some homework");
        ArrayList<String> todos = todolist.remove("Do some homework");
        Assertions.assertEquals(todos, expectedTodos);
    }

    @Test
    public void testGet() {
        todolist.create("Do some homework 1");
        todolist.create("Do some homework 2");
        todolist.remove("Do some homework 2");

        ArrayList<String> todos = todolist.get();
        ArrayList<String> expectedTodos = new ArrayList<>();
        expectedTodos.add("Do some homework 1");
        Assertions.assertEquals(todos, expectedTodos);
    }

}