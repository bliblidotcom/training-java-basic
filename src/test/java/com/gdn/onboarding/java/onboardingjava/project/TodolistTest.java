package com.gdn.onboarding.java.onboardingjava.project;

import com.gdn.onboarding.java.onboardingjava.project.todolist.Todo;
import com.gdn.onboarding.java.onboardingjava.project.todolist.TodoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TodolistTest {
    @Test
    public void todoTest_Add(){
        TodoService service = TodoService.getInstance();
        Todo todo = new Todo(TodoService.todos.size(), "New Todo");
        Todo result = service.add(todo);
        Assertions.assertEquals(todo, result);
    }

    @Test
    public void todoTest_RemoveSuccess(){
        TodoService service = TodoService.getInstance();
        Todo todo = new Todo(0, "My Todo");
        Todo result = service.remove(0);
        Assertions.assertEquals(todo, result);
    }

    @Test
    public void todoTest_RemoveFailed(){
        TodoService service = TodoService.getInstance();
        Todo result = service.remove(10);
        Assertions.assertEquals(null, result);
    }

    @Test
    public void printTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TodoService service = TodoService.getInstance();
        service.print();
        String expectedOutput  = "Id : 0, Description : My Todo\nId : 1, Description : New Todo\n";
        Assertions.assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void printTest_NoData(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TodoService service = TodoService.getInstance();
        service.removeAll();
        service.print();
        String expectedOutput  = "No data\n";
        Assertions.assertEquals(expectedOutput, outContent.toString());
    }
}
