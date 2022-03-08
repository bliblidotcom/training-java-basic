package com.gdn.bootcamp.day1assignment.three.todolist;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Todo {
    private UUID id;
    private String title;
    private String description;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
