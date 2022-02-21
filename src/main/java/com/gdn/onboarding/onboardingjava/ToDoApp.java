package com.gdn.onboarding.onboardingjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.exit;

public class ToDoApp {

    public static List<ToDo> toDos = new ArrayList<ToDo>();

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    private static String[] options = {
            "1: Add ToDo ",
            "2: Delete ToDo",
            "3: Show ToDo",
            "4: Exit"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu(options);
            int option = Integer.valueOf(scanner.nextLine());
            try {
                switch (option) {
                    case 1:
                        System.out.println("Enter Task: ");
                        String task = scanner.nextLine();
                        System.out.println("Enter Description: ");
                        String desc = scanner.nextLine();
                        addToDo(new ToDo(task, desc));
                        break;
                    case 2:
                        System.out.println("Select No Task: ");
                        int idx = Integer.valueOf(scanner.nextLine());
                        deleteToDo(idx - 1);
                        break;
                    case 3:
                        showToDo();
                        break;
                    case 4:

                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }

    }

    public static void addToDo(ToDo todo) {
        toDos.add(todo);
    }

    public static void deleteToDo(int index) {
        toDos.remove(index);
    }

    public static void showToDo() {
        int idx = 1;
        System.out.println("\nList of Task");
        for (ToDo toDo : toDos) {
            System.out.println("No." + idx + " - Task: " + toDo.getTask() + "   |   Description: " + toDo.getDesc());
            idx++;
        }
        System.out.println("\n");

    }

}
