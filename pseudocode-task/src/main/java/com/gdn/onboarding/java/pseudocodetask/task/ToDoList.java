package com.gdn.onboarding.java.pseudocodetask.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import lombok.Data;

//@Service
@Data
public class ToDoList {
  private Map<String, String> todos = new HashMap<>();

  public void add(String k, String v) {
    if(k == null|| v== null){
      throw new IllegalArgumentException("Parameter cannot be null!");
    }
    todos.put(k, v);
  }

  public void remove(String k) {
    if(k == null){
      throw new IllegalArgumentException("Parameter cannot be null!");
    }
    todos.remove(k);
  }

  public String print() {
    if(todos.isEmpty()){
      throw new IllegalArgumentException("Insert Todos first!");
    }
    String result = "Time \t: Todo\n";
    for (Map.Entry entry : todos.entrySet()) {
      result += entry.getKey() + " \t: " + entry.getValue() + "\n";
    }
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o == null) {
      return false;
    }
    ToDoList compare = (ToDoList) o;

    boolean same = true;
    if (todos.isEmpty()) {
      same = false;
    }
    for (Map.Entry e : todos.entrySet()) {
      if (compare.getTodos().get(e.getKey()) == null) {
        same = false;
      } else {
        if (compare.getTodos().get(e.getKey()) != e.getValue()) {
          same = false;
        }
      }
    }

    return same;
  }
}
