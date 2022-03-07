package com.gdn.onboarding.java.onboardingjava.project.todoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TodoList {
    public Scanner scan = new Scanner(System.in);
    private List<Todo> todoList = new ArrayList<>();

    public static void main(String[] args) {
        new TodoList();
    }

    public TodoList() {
//        codeApp();
    }

    private void codeApp() {
        int choose;
        do {
            menu();
            choose = scan.nextInt();
            scan.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Body: ");
                    String body = scan.nextLine();
                    addTodo(body);
                    break;
                case 2:
                    printAllTodo();
                    if (!todoList.isEmpty()) {
                        System.out.print("Todo Number: ");
                        Integer index = scan.nextInt();
                        scan.nextLine();
                        removeTodo(index - 1);
                    }
                    break;
                case 3:
                    printAllTodo();
                    break;
                default:
                    System.out.println("Choose between 1-3");
            }
            System.out.println("\n");
        } while (true);
    }

    private void menu() {
        System.out.println("TODO LIST APP");
        System.out.println("-------------");
        System.out.println("1. Add Todo");
        System.out.println("2. Remove Todo");
        System.out.println("3. Print All Todo");
        System.out.print(">> ");
    }

    private void validateString(String body) {
        if (body == null) throw new IllegalArgumentException("Parameter cannot be null");
        else if (body.length() == 0) throw new IllegalArgumentException("Body cannot be empty");
    }

    private void validateTodoIndex(Integer index) {
        if (index == null || index < 0 || index > todoList.size() - 1)
            throw new IllegalArgumentException("Index must be between 1-" + todoList.size());
    }

    public Boolean addTodo(String body) {
        validateString(body);
        Todo newTodo = new Todo(body);
        todoList.add(newTodo);
        return true;
    }

    public Boolean removeTodo(Integer index) {
        validateTodoIndex(index);
        todoList.remove(index.intValue());
        return true;
    }

    public List<Todo> getAllTodo() {
        if (todoList.isEmpty()) {
            return null;
        }
        return todoList;
    }

    public void printAllTodo() {
        List<Todo> todos = getAllTodo();
        if (todos == null || todos.isEmpty()) {
            System.out.println("Empty...");
            return;
        }
        AtomicInteger index = new AtomicInteger(1);
        todoList.stream().forEach(t -> {
            System.out.println((index.getAndIncrement()) + ". " + t.getBody());
        });
    }
}
