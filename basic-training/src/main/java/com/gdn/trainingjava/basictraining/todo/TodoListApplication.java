package com.gdn.trainingjava.basictraining.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApplication {
    private int currentChoice = 0;
    private static List<String> todoList = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    private String dump;

    TodoListApplication() {
        while(currentChoice != 5) {
            Greeting();
            ControlTodo();
            System.out.println();
        }
        System.out.println("Thank you for using CLI ToDo!\nmade by jasandgun.");
    }

    private void Greeting() {
        System.out.println("Welcome to CLI ToDo!");
        System.out.println("To get started, choose one of these options below: ");
        System.out.println("\t1. View your list\n \t2. Add item\n " +
                "\t3. Mark item as done\n \t4. Update an item\n \t5. Quit");
        // User Input
        System.out.printf("option: ");
        currentChoice = input.nextInt();
        while (currentChoice < 1 || currentChoice > 5) {
            System.out.printf("not available, option: ");
            currentChoice = input.nextInt();
        }
        dump = input.nextLine();
    }

    private void ControlTodo() {
        switch (currentChoice){
            case 1:
                viewList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                markItem();
                break;
            case 4:
                updateItem();
                break;
            case 5:
                return;
        }
    }

    private void viewList() {
        if (todoList.isEmpty()) {
            System.out.println("Your list is currently empty.");
            return;
        }
        System.out.println("--Start of List--");
        for (int i = 0; i < todoList.size(); i++)
            System.out.printf("%d. %s\n", i+1, todoList.get(i));
        System.out.println("--End of List--");
    }

    private void addItem() {
        System.out.println("What do you want to add?");
        String item = input.nextLine();
        todoList.add(item);
    }

    private void markItem() {
        System.out.println("Which item would you like to mark as done?");
        System.out.printf("Enter the item's number: ");
        int marked = input.nextInt() - 1;
        dump = input.nextLine();
        if (todoList.size() < marked + 1 || marked < 0) {
            System.out.println("No item with this number.");
        } else {
            todoList.remove(marked);
        }
    }

    private void updateItem() {
        System.out.println("Which item would you like to update?");
        System.out.printf("Enter the item's number: ");
        int updated = input.nextInt() - 1;
        dump = input.nextLine();
        if (todoList.size() < updated + 1 || updated < 0) {
            System.out.println("No item with this number.");
        } else {
            System.out.printf("Item: %d; Desc: %s\n", updated+1, todoList.get(updated));
            System.out.printf("Insert update: ");
            String toBeUpdated = input.nextLine();
            todoList.set(updated, toBeUpdated);
        }
    }

    public static void main (String[] args) {
        TodoListApplication todo = new TodoListApplication();
    }
}
