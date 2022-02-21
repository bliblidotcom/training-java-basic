package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoAppTests {
    @Test
    void testAddToDo() {
        // The size of todos list at this point is 0
        // The size of todos list after this command is 1
        ToDoApp.addToDo(new ToDo("This is a task", "This is a description"));
        Assertions.assertEquals(1, ToDoApp.toDos.size());
    }

    @Test
    void testDeleteToDoSuccess() {
        // The size of todos list at this point is 1
        // The size of todos list after this process is 0
        ToDoApp.deleteToDo(0);
        Assertions.assertEquals(0, ToDoApp.toDos.size());
    }

    @Test
    void testDeleteToDoFailed() {
        // The size of todos list at this point is 0
        // This following command should make the program throw exception
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ToDoApp.deleteToDo(0);
        });
    }
}
