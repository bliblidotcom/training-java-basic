package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToDoListTest {

    private static final ToDoList todoList = new ToDoList();

    @Test
    public void testAdd_success(){

        Assertions.assertDoesNotThrow(() -> {
            todoList.add("Todo 1");
        });
    }

    @Test
    public void testAdd_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            todoList.add(null);
        });
    }

    @Test
    public void testRemove_success(){
        Assertions.assertTrue(todoList.remove("Todo 1"));
    }

    @Test
    public void testRemove_failed(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
           todoList.remove("Todo 2");
        });
    }

    @Test
    public void testPrint_success(){
        Assertions.assertTrue(todoList.print());
    }
}