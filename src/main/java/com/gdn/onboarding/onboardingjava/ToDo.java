package com.gdn.onboarding.onboardingjava;

public class ToDo {
    private String task;
    private String desc;

    public ToDo() {
    }

    public ToDo(String task, String desc) {
        this.task = task;
        this.desc = desc;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
