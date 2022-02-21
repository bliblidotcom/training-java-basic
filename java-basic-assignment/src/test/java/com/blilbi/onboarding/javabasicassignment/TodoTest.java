package com.blilbi.onboarding.javabasicassignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import com.blilbi.onboarding.Todo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoTest {
  Todo todo;

  @BeforeEach
  public void init() {
    todo = new Todo();
  }

  @Test
  public void insertTodoTest() {
    // expected
    HashMap<Integer, String> tasks = new HashMap<Integer, String>();
    tasks.put(0, "Tugas ke 1");

    // actual
    todo.insertTodo("Tugas ke 1");

    assertEquals(tasks.keySet(), todo.getTodo().keySet());
  }

  @Test
  public void getTodoTest() {
    // expected
    HashMap<Integer, String> tasks = new HashMap<Integer, String>();
    tasks.put(0, "Tugas ke 1");
    tasks.put(1, "Tugas ke 2");

    // actual
    todo.insertTodo("Tugas pertama saya");
    todo.insertTodo("Tugas kedua saya");

    // compare todo keySet
    assertEquals(tasks.keySet(), todo.getTodo().keySet());
  }

  @Test
  public void removeTodoTest() {
    // expected
    HashMap<Integer, String> tasks = new HashMap<Integer, String>();
    tasks.put(0, "Tugas ke 1");
    

    // actual
    todo.insertTodo("Tugas ke 1");

    assertEquals(tasks.keySet(), todo.getTodo().keySet());

    // remove expected
    tasks.remove(0);

    // remove actual
    todo.removeTodo(0);

    // remove compare
    assertEquals(tasks.keySet(), todo.getTodo().keySet());
  }
}
