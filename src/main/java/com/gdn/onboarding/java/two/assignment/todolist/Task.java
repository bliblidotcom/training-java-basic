package com.gdn.onboarding.java.two.assignment.todolist;

public class Task {
    private String date;
    private String taskTitle;

    public Task(String date, String taskTitle){
        this.date = date;
        this.taskTitle = taskTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }
}
