package com.gdn.onboarding.onboardingjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private static List<Todo> td = new ArrayList<>();

    public static class Todo {
        String content;

        public Todo(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }
    }

    public static void mainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("1.Add to todos");
        System.out.println("2.View todos");
        System.out.println("3.Update a todo");
        System.out.println("4.Delete a todo");
        System.out.println("5.Exit");
        System.out.print("Choice : ");
        Integer in = scan.nextInt();
        while (in < 1 || in > 5) {
            System.out.println("invalid!");
            System.out.print("Choice : ");
            in = scan.nextInt();
        }
        if (in == 1) {
            addTodo();
        } else if (in == 2) {
            viewTodo();
        } else if (in == 3) {
            updateTodo();
        } else if (in == 4){
            deleteTodo();
        } else {
            return;
        }
    }

    public static void deleteTodo() {
        Scanner scan = new Scanner(System.in);
        if (td.isEmpty()) {
            System.out.println("Your Todos are empty!\n");
        } else {
            System.out.println("Which id? : ");
            Integer idx = scan.nextInt();
            while (idx > td.size() || idx < 0) {
                System.out.println("Invalid input");
                System.out.println("Which id? : ");
                String temp = scan.nextLine();
                idx = scan.nextInt();
            }
            td.remove(idx-1);
            System.out.println("Deleted\n");
        }
        mainMenu();
    }

    public static void updateTodo() {
        Scanner scan = new Scanner(System.in);
        if (td.isEmpty()) {
            System.out.println("Your Todos are empty!\n");
        } else {
            System.out.println("Which id? : ");
            Integer idx = scan.nextInt();
            while (idx > td.size() || idx < 0) {
                System.out.println("Invalid input");
                System.out.println("Which id? : ");
                idx = scan.nextInt();
            }
            String temp = scan.nextLine();
            System.out.println("Change to what? : ");
            String newContent = scan.nextLine();
            Todo newTodo = new Todo(newContent);
            td.set(idx-1, newTodo);
            System.out.println("Updated\n");
        }
        mainMenu();
    }

    public static void viewTodo() {
        Scanner scan = new Scanner(System.in);
        if (td.isEmpty()) {
            System.out.println("Your Todos are empty!\n");
        } else {
            Integer num = 1;
            for (Todo todo : td) {
                System.out.println("id: " + num + ", content: " + todo.getContent());
                num++;
            }
            System.out.println("You've reached the bottom!\n");
        }
        mainMenu();
    }

    public static void addTodo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert new todo : ");
        String content = scan.nextLine();
        Todo todo = new Todo(content);
        td.add(todo);
        System.out.println("Added!\n");
        mainMenu();
    }


    public static void main(String[] args) {
        mainMenu();
    }
}
