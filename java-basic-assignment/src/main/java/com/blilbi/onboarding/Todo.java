package com.blilbi.onboarding;

import java.util.HashMap;

public class Todo {

  private HashMap<Integer, String> tasks = new HashMap<Integer, String>();

  public HashMap<Integer, String> getTodo() {
    return tasks;
  }

  public void showTodoList(HashMap<Integer, String> todo) {
    System.out.println("List Todo :");
    System.out.println(todo.size());

    if (todo.size() > 0) {
      for (int i : todo.keySet()) {
        System.out.println(i + ". Tugas: " + todo.get(i));
      }
    } else {
      System.out.println("Kosong");
    }
  }

  public void insertTodo(String task) {
    int taskLong = tasks.size(); 
    int key = taskLong > 0 ? taskLong++ : 0;

    tasks.put(key, task);
  }

  public void removeTodo(int key) {
    int gotIt = 0;

    for (int i : tasks.keySet()) {
      if (key == i) {
        System.out.println("Data ditemukan. key: " + i + " dihapus.");
        tasks.remove(key);
        gotIt++;
        break;
      }
    }

    if (gotIt == 0) {
      System.out.println("Data tidak ditemukan.");
    }
  }
}
