package com.gdn.onboarding.java.two.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    @Test
    void add_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Task");
        List<String> result = toDoList.getList();
        List<String> expected = new ArrayList<>();
        expected.add("Task");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void add_fail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.add(null);
            List<String> result = toDoList.getList();
            List<String> expected = new ArrayList<>();
            expected.add(null);

            Assertions.assertEquals(expected, result);
        });
    }

    @Test
    void remove_success1() {
        ToDoList toDoList = new ToDoList();
        toDoList.print();
        toDoList.add("TaskA");
        toDoList.add("TaskB");
        toDoList.remove("TaskB");
        List<String> result = toDoList.getList();
        List<String> expected = new ArrayList<>();
        expected.add("TaskA");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void remove_success2() {
        ToDoList toDoList = new ToDoList();
        toDoList.add("TaskA");
        toDoList.add("TaskB");
        toDoList.remove("TaskC");
        List<String> result = toDoList.getList();
        List<String> expected = new ArrayList<>();
        expected.add("TaskA");
        expected.add("TaskB");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void remove_fail1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.add("TaskA");
            toDoList.add("TaskB");
            toDoList.remove(null);
            List<String> result = toDoList.getList();
            List<String> expected = new ArrayList<>();
            expected.add("TaskA");

            Assertions.assertEquals(expected, result);
        });
    }

    @Test
    void remove_fail2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.remove(null);
            List<String> result = toDoList.getList();
            List<String> expected = new ArrayList<>();

            Assertions.assertEquals(expected, result);
        });
    }
}