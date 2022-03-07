package com.gdn.onboarding.java.todolist.model;

import java.time.LocalDate;
import java.util.Date;

public class Todo {

    private String activity;
    private String description;
    private LocalDate deadline;

    public Todo(String activity, String description, LocalDate deadline) {
        this.activity = activity;
        this.description = description;
        this.deadline = deadline;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
