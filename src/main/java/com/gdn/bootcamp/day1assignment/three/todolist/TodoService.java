package com.gdn.bootcamp.day1assignment.three.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> readAll() {
        return todoRepository.readAll();
    }

    public Todo readById(UUID id) {
        return todoRepository.readById(id);
    }

    public Todo create(Todo todoToCreate) {
        todoToCreate.setId(UUID.randomUUID());
        todoToCreate.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));
        todoToCreate.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        return todoRepository.create(todoToCreate);
    }

    public Todo updateById(UUID id, Todo todoToUpdate) {
        todoToUpdate.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));
        return todoRepository.updateById(id, todoToUpdate);
    }

    public Todo patchById(UUID id, Todo todoToPatch) {
        Todo todoFound = this.readById(id);

        if (todoToPatch.getTitle() != null) {
            todoFound.setTitle(todoToPatch.getTitle());
        }
        if (todoToPatch.getDescription() != null) {
            todoFound.setDescription(todoToPatch.getDescription());
        }
        if (todoToPatch.getStatus() != null) {
            todoFound.setStatus(todoToPatch.getStatus());
        }
        return todoRepository.updateById(id, todoFound);
    }

    public Todo deleteById(UUID id) {
        return todoRepository.deleteById(id);
    }
}
