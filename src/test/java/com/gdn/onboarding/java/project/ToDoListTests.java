package com.gdn.onboarding.java.project;

import com.gdn.onboarding.java.project.todolist.ToDo;
import com.gdn.onboarding.java.project.todolist.ToDoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoListTests {

    @Test
    public void testToDoList_success() {
        ToDoList toDoList = new ToDoList();
        toDoList.add("To Do 1", "Ini to do 1");
        toDoList.add("To Do 2", "Ini to do 2");
        toDoList.add("To Do 3", "Ini to do 3");
        Assertions.assertNotNull(toDoList.get(0));
        Assertions.assertNotNull(toDoList.get(1));
        Assertions.assertNotNull(toDoList.get(2));

        ToDo toDo = toDoList.get(1);
        ToDo deletedToDo = toDoList.remove(1);
        Assertions.assertSame(toDo, deletedToDo);

        toDoList.printAll();
    }

    @Test
    public void testToDoList_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.add(null, "Ini to do 1");
        });

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.remove(0);
        });

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.get(0);
        });
    }


}
