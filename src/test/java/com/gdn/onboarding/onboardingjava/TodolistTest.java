package com.gdn.onboarding.onboardingjava;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TodolistTest {

    @Test
    public void testAddTodo() {
        Todolist tdl = new Todolist();
        tdl.addTodo("A");
        tdl.addTodo("B");
        tdl.addTodo("C");

        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");

        assertEquals(expected, tdl.getTodolist());
    }

    @Test
    public void testClearDone() {
        Todolist tdl = new Todolist();
        tdl.addTodo("A");
        tdl.addTodo("B");
        tdl.addTodo("C");

        tdl.doneTodo("A");
        tdl.doneTodo("B");

        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");

        assertEquals(expected, tdl.getTodolist());

        tdl.clearDone();
        expected.remove(0);
        expected.remove(0);

        assertEquals(expected, tdl.getTodolist());

    }


}
