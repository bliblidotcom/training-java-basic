package com.gdn.onboarding.onboardingjava.contracts;

public interface ToDoList {
    void getAll();
    String getById(int id);
    int add(String message);
    boolean update(int id, String message);
    boolean delete(int id);
}
