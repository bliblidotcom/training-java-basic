package com.gdn.onboarding.java.two.onboardingjava.todoList;

import com.gdn.onboarding.java.two.onboardingjava.project.LetterGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    public void testAddTodo_success1(){
        List<String> todoList = new ArrayList<>();
        todoList.add("Makan Siang");
        todoList.add("Belajar Java");
        todoList.add("Mengerjakan Project");

        TodoList todo = new TodoList();
        todo.addTodo("Makan Siang");
        todo.addTodo("Belajar Java");
        todo.addTodo("Mengerjakan Project");
        Assertions.assertLinesMatch(todoList, todo.getTodo());
    }

    @Test
    public void testRemoveTodo_success1(){
        List<String> todoList = new ArrayList<>();
        todoList.add("Belajar Java");
        todoList.add("Mengerjakan Project");

        TodoList todo = new TodoList();
        todo.addTodo("Makan Siang");
        todo.addTodo("Belajar Java");
        todo.addTodo("Mengerjakan Project");
        todo.removeTodo("Makan Siang");
        Assertions.assertLinesMatch(todoList, todo.getTodo());
    }

    @Test
    public void testAddTodo_failed1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            List<String> todoList = new ArrayList<>();
            todoList.add("Makan Siang");
            todoList.add("Belajar Java");
            todoList.add("Mengerjakan Project");

            TodoList todo = new TodoList();
            todo.addTodo(null);
            todo.addTodo("Belajar Java");
            todo.addTodo("Mengerjakan Project");
            Assertions.assertLinesMatch(todoList, todo.getTodo());
        });
    }
    @Test
    public void testRemoveTodo_failed1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            List<String> todoList = new ArrayList<>();
            todoList.add("Belajar Java");
            todoList.add("Mengerjakan Project");

            TodoList todo = new TodoList();
            todo.addTodo("Makan Siang");
            todo.addTodo("Belajar Java");
            todo.addTodo("Mengerjakan Project");
            todo.removeTodo("Makan Siang");
            todo.removeTodo(null);
            Assertions.assertLinesMatch(todoList, todo.getTodo());
        });
    }
}