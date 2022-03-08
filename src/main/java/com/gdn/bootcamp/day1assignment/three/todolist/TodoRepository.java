package com.gdn.bootcamp.day1assignment.three.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public class TodoRepository {
    private List<Todo> todoDatabase;

    @Autowired
    public TodoRepository(List<Todo> todoDatabase) {
        this.todoDatabase = todoDatabase;
    }

    public List<Todo> getTodoDatabase() {
        return todoDatabase;
    }

    public List<Todo> readAll() {
        if (todoDatabase.isEmpty()) {
            throw new RuntimeException("Todo list is empty");
        }
        return this.todoDatabase;
    }

    public Todo readById(UUID id) {
        return this.todoDatabase.stream().filter(todo -> todo.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    public Todo create(Todo todoToCreate) {
        if (todoToCreate == null) {
            throw new RuntimeException("Todo cannot be null");
        }

        Boolean isTodoIdNotUnique = this.todoDatabase.stream().anyMatch(x -> x.getId().equals(todoToCreate.getId()));
        if (isTodoIdNotUnique) {
            throw new RuntimeException("Todo id must be unique");
        }

        this.todoDatabase.add(todoToCreate);
        return todoToCreate;
    }

    public Todo updateById(UUID id, Todo todoToUpdate) {
        Todo todoFound = this.readById(id);
        int index = this.todoDatabase.indexOf(todoFound);
        this.todoDatabase.set(index, todoToUpdate);

        return todoToUpdate;
    }

    public Todo deleteById(UUID id) {
        Todo todoToFound = this.readById(id);
        this.todoDatabase.remove(todoToFound);
        return todoToFound;
    }
}



