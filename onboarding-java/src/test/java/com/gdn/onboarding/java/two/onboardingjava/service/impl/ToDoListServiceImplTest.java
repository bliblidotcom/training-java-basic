package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListServiceImplTest {
    ToDoListServiceImpl toDoListService;
    int currentListSize;
    @BeforeEach
    void setUp() {
        toDoListService = new ToDoListServiceImpl();
        toDoListService.addTask("Meeting with client at 2 p.m.");
        toDoListService.addTask("Meeting with friend at 2 p.m.");
        currentListSize = toDoListService.getToDoList().size();
    }

    @Test
    void testAddTask_success() {
        Assertions.assertEquals("Meeting with client at 2 p.m.", toDoListService.getToDoList().get(0));
    }

    @Test
    void testAddTask_failed() {
        Assertions.assertNotEquals("Meeting with friend at 2 p.m.", toDoListService.getToDoList().get(0));
    }

    @Test
    void testDeleteTask_success() {
        toDoListService.deleteTask(2);
        Assertions.assertEquals(1, currentListSize-1);
    }

    @Test
    void testDeleteTask_failed() {
        toDoListService.deleteTask(2);
        Assertions.assertEquals(1, currentListSize-1);
    }

}