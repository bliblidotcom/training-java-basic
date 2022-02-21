package com.gdn.repotutorial.repotutorial;

public class Task {
    private String task;
    private boolean status;

    public Task(String task, Boolean status) {
        this.task = task;
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public boolean getStatus() {
        return status;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
