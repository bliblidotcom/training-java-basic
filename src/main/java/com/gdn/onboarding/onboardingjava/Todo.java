package com.gdn.onboarding.onboardingjava;

public class Todo {
    private String activity;
    private boolean reminder;

    public Todo(String activity, boolean reminder) {
        this.activity = activity;
        this.reminder = reminder;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String todo) {
        this.activity = todo;
    }

    public boolean isReminder() {
        return reminder;
    }

    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }

    public String stringify() {
        return "Activity: " + this.activity + " | Reminder : " + reminder;
    }
}
