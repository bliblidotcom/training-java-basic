package com.gdn.onboarding.java.pseudocodetask.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToDoListTest {
  private final ToDoList toDoList = new ToDoList();

  @Test
  public void addTodoList_success() {
    toDoList.add("14:00", "Training Spring 1");
    ToDoList compare = new ToDoList();
    compare.add("14:00", "Training Spring 1");
    Assertions.assertEquals(compare, toDoList);
  }

  @Test
  public void addTodoList_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      toDoList.add(null,"Spring 1");
      ToDoList compare = new ToDoList();
      compare.add("14:00", "Training Spring 1");
      Assertions.assertEquals(compare, toDoList);
    });
  }

  @Test
  public void removeTodoList_success() {
    toDoList.add("14:01", "Training Spring 2");
    toDoList.remove("14:00");
    ToDoList compare = new ToDoList();
    compare.add("14:01", "Training Spring 2");
    Assertions.assertEquals(compare, toDoList);
  }

  @Test
  public void removeTodoList_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      toDoList.remove(null);
      ToDoList compare = new ToDoList();
      compare.add("14:01", "Training Spring 2");
      Assertions.assertEquals(compare, toDoList);
    });
  }

  @Test
  public void printTodoList_success() {
    if(toDoList.getTodos().isEmpty()){
      toDoList.add("14:01","Training Spring 2");
    }
    String result = toDoList.print();
    ToDoList compare = new ToDoList();
    compare.add("14:01", "Training Spring 2");
    String compareString = compare.print();
    Assertions.assertEquals(compareString, result);
  }

  @Test
  public void printTodoList_failed() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      toDoList.remove("14:01");
      String result = toDoList.print();
      ToDoList compare = new ToDoList();
      compare.add("14:01", "Training Spring 2");
      String compareString = compare.print();
      Assertions.assertEquals(compareString, result);
    });
  }
}