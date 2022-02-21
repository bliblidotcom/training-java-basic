package com.gdn.onboarding.onboardingjava;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoList {

  private List<String> todoList;

  public void addTodo(String todo) {
    todoList.add(todo);
  }

  public List<String> getAll() {
    return todoList;
  }

  public void updateTodo(String todoBefore, String todoAfter) {
    for (int i = 0; i < todoList.size(); i++) {
      if(todoList.get(i).equalsIgnoreCase(todoBefore)) {
        todoList.set(i, todoAfter);
      }
    }
  }

  public void removeTodo(String todo) {
    //Either contain or not, it's not error yet
    todoList.remove(todo);
  }
}
