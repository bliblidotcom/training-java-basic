package com.gdn.onboarding.java.project.todolist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ToDoList {

    private List<ToDo> toDoList = new ArrayList<>();

    public void add(String title, String description) {
        if(title == null || description == null) {
            throw new IllegalArgumentException("Title or Description should not be null!");
        }
        ToDo toDo = new ToDo(title, description);
        toDoList.add(toDo);
    }

    public ToDo remove(int index) {
        if(index < 0 || index >= toDoList.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        return toDoList.remove(index);
    }

    public void printAll() {
        toDoList.stream()
                .forEach(toDo -> log.info(toDo.getTitle() + " - " + toDo.getDescription()));
    }

    public ToDo get(Integer index) {
        if(index == null) {
            throw new IllegalArgumentException("Index should not be null!");
        }

        if(index < 0 || index >= toDoList.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        return toDoList.get(index);
    }

}
