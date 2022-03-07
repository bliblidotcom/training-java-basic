package com.gdn.onboarding.java.two.assignment.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> taskList = new ArrayList<>();

    public List<Task> getTaskList() {
        return taskList;
    }

    public void validateDate(String date){
        if(date.matches("^\\d{2}-\\d{2}-\\d{4}")) {
            String[] splittedDate = date.trim().split("-");
            Integer day = Integer.valueOf(splittedDate[0]);
            Integer month = Integer.valueOf(splittedDate[1]);
            Integer year = Integer.valueOf(splittedDate[2]);

            if(month == 2) {
                if(year % 4 == 0 && day > 29 || year % 4 != 0 && day > 28) {
                    throw new IllegalArgumentException("Invalid Day!");
                }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11) {
                if(day > 30) {
                    throw new IllegalArgumentException("Invalid Day!");
                }
            }
            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day > 31) {
                    throw new IllegalArgumentException("Invalid Day!");
                }
            }
            else {
                throw new IllegalArgumentException("Invalid Month!");
            }
        }
        else {
            throw new IllegalArgumentException("Invalid Date Format!");
        }
    }

    public void addTask(String date, String task) {
        validateDate(date);
        Task newTask = new Task(date, task);
        taskList.add(newTask);
        // System.out.println("Successfully Added!");
    }

    public void printTask() {
        if(taskList.isEmpty()) {
            throw new NullPointerException("No Task Available...");
        }
        else {
            for(int i = 0; i< taskList.size(); i++) {
                System.out.println((i+1) + ". " + taskList.get(i).getDate() + "\t" + taskList.get(i).getTaskTitle());
            }
        }
    }

    public void removeTask(int index) {
        index = index - 1;

        if(taskList.isEmpty()) {
            throw new NullPointerException("No Available Task!");
        }
        if(index < 0 || index > taskList.size()) {
            throw new IndexOutOfBoundsException("Invalid Index!");
        }

        taskList.remove(index);
        System.out.println("Successfully Removed!");
    }
}
