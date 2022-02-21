package com.gdn.onboarding.onboardingjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private static List<String> todolist = new ArrayList<>();

    public static void console(){
        System.out.println("Welcome to ToDoList app!");
        System.out.println("1. Show to do list");
        System.out.println("2. Add task to do list");
        System.out.println("3. Remove task to do list");
        System.out.println("Press 0 to quit");
        System.out.println("Choose your option: (0-3)" );
    }

    public static void showList(){
        if (todolist.isEmpty()){
            System.out.println("Add task first!");
        }else{
            int num = 1;
            for(String task: todolist){
                System.out.printf("%d. %s\n",num,task);
                num++;
            }
            System.out.printf("\n");
        }
    }

    public static void addTask(){
        System.out.println("Insert task: ");
        Scanner scan = new Scanner(System.in);
        String task = scan.nextLine();
        todolist.add(task);
        System.out.println("Task successfully added!");
    }

    public static void deleteTask(){
        if (todolist.isEmpty()){
            System.out.println("Add task first!");
        }else {
            System.out.println("Choose the task: ");
            showList();
            Scanner scan = new Scanner(System.in);
            int taskIdx = scan.nextInt() - 1;

            if(taskIdx < 0 || (taskIdx+1) > todolist.size())
                System.out.println("Insert valid number!");
            else{
                todolist.remove(taskIdx);
                System.out.println("Task deleted!");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int option;
        boolean go = true;
        while(go == true){
            ToDoList.console();
            option = scan.nextInt();
            switch (option){
                case 1:
                    showList();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 0:
                    go = false;
                    break;
                default:
                    System.out.println("I'm afraid that's not a right choice :(");
                    break;
            }
        }
    }

}
