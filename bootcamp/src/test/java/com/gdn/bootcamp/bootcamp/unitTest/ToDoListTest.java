package com.gdn.bootcamp.bootcamp.unitTest;

import com.gdn.bootcamp.bootcamp.todolist.ToDoList;
import com.gdn.bootcamp.bootcamp.unit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ToDoListTest {

    ToDoList toDoList;
    List<String> expectedList;

    @BeforeEach
    void ToDoListTest(){
        toDoList = new ToDoList();
        expectedList = new ArrayList<>();
    }

    @Test
    void testAdd_success(){
        toDoList.add("A");
        expectedList.add("A");
        Assertions.assertEquals(toDoList.getToDoList(), expectedList);
    }

    @Test
    void testAdd_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            toDoList.add(null);
        });
    }

    @Test
    void testRemove_success1(){
        toDoList.add("A");
        expectedList.add("A");
        toDoList.add("B");
        expectedList.add("B");
        toDoList.remove("A");
        expectedList.remove("A");
        Assertions.assertEquals(toDoList.getToDoList(), expectedList);
    }

    @Test
    void testRemove_success2(){
        toDoList.add("A");
        expectedList.add("A");
        toDoList.add("B");
        expectedList.add("B");
        toDoList.remove("B");
        expectedList.remove("B");
        Assertions.assertEquals(toDoList.getToDoList(), expectedList);
    }

    @Test
    void testRemove_success3(){
        toDoList.add("A");
        expectedList.add("A");
        toDoList.add("A");
        expectedList.add("A");
        toDoList.remove("A");
        expectedList.remove("A");
        Assertions.assertEquals(toDoList.getToDoList(), expectedList);
    }

    @Test
    void testRemove_success4(){
        toDoList.add("A");
        expectedList.add("A");
        toDoList.add("B");
        expectedList.add("B");
        toDoList.add("A");
        expectedList.add("A");
        toDoList.remove("A");
        expectedList.remove("A");
        Assertions.assertEquals(toDoList.getToDoList(), expectedList);
    }

    @Test
    void testRemove_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            toDoList.remove(null);
        });
    }
}
