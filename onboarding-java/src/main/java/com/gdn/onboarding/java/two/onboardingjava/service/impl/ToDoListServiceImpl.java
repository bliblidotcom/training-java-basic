package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.ToDoListService;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ToDoListServiceImpl implements ToDoListService {
    Scanner scan = new Scanner(System.in);

    @Getter
    private List<String> toDoList;

    public ToDoListServiceImpl() {
        this.toDoList = new ArrayList<>();
    }

    public void appMenu(){
        System.out.println("Welcome to Blibli ToDoList app!");
        System.out.println("1. Show all To Do List");
        System.out.println("2. Add To Do List");
        System.out.println("3. Remove To Do List");
        System.out.println("4. Exit");
        System.out.print("Choose>>" );
    }

    public void clearScreen(){
        for(int i=0 ; i<50; i++){
            System.out.println();
        }
    }
    @Override
    public void addTask(String task) {
        toDoList.add(task);
        System.out.println("Task has been added!");

    }

    @Override
    public void deleteTask(int taskIndex) {
        toDoList.remove(taskIndex-1);
        System.out.println("Task deleted!");

    }


    @Override
    public void printTask() {
        if(toDoList.isEmpty()){
            System.out.println("Add your first task !!" );
        }else {
            int position=1;
            for (String toDo: toDoList) {
                System.out.println(position + ". "+ toDo);
                position++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListServiceImpl toDoListService = new ToDoListServiceImpl();

        int choose;
        do{
            toDoListService.clearScreen();
            toDoListService.appMenu();
            choose = scanner.nextInt(); scanner.nextLine();

            if(choose ==1){
                toDoListService.clearScreen();
                toDoListService.printTask();
                System.out.println("Press Enter to continue..." );
                scanner.nextLine();
            }else if(choose == 2){
                toDoListService.clearScreen();
                System.out.print("Input your task: ");
                String task = scanner.nextLine();
                toDoListService.addTask(task);
                System.out.println("Press Enter to continue..." );
                scanner.nextLine();
            }else if(choose == 3){
                toDoListService.clearScreen();
                if(toDoListService.toDoList.isEmpty()) {
                    System.out.println("Add your first task !!");
                }else {
                    toDoListService.printTask();
                    int wantToDelete;
                    System.out.println("");
                    do{
                        System.out.println("Choose task you want to remove>>");
                        wantToDelete = scanner.nextInt(); scanner.nextLine();
                    }while (wantToDelete <= 0 || wantToDelete> toDoListService.toDoList.size());
                    toDoListService.deleteTask(wantToDelete);
                }


                System.out.println("Press Enter to continue..." );
                scanner.nextLine();
            }else if (choose == 4){
                break;
            }
        }while(true);
    }
}
