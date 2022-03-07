package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    public void testAdd_success(){
        ToDoList toDoList = new ToDoList();
        toDoList.add("Task1");

        List<String> expected = new ArrayList<>();
        expected.add("Task1");
        Assertions.assertEquals(expected, toDoList.getTasks());
    }

    @Test
    public void testAdd_fail(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.add(null);

            List<String> expected = new ArrayList<>();
            expected.add("Task1");
            Assertions.assertEquals(expected,toDoList.getTasks());
        });
    }

    @Test
    public void testRemove_success(){
        ToDoList toDoList = new ToDoList();
        toDoList.add("Task1");
        toDoList.remove("Task1");

        List<String> expected = new ArrayList<>();
        Assertions.assertEquals(expected, toDoList.getTasks());
    }

    @Test
    public void testRemove_fail(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ToDoList toDoList = new ToDoList();
            toDoList.add("Task1");
            toDoList.remove(null);

            List<String> expected = new ArrayList<>();
            expected.add("Task1");
            Assertions.assertEquals(expected,toDoList.getTasks());
        });
    }
}