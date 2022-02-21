package com.gdn.onboarding.onboardingjava;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    ArrayList<Todo> todoList = new ArrayList<Todo>();

    public void addTodo(String activity, boolean reminder) {
        Todo newTodo = new Todo(activity, reminder);
        todoList.add(newTodo);
    }

    public void removeTodo(int id) {
        if (id > 0 && id <= todoList.size()) {
            todoList.remove(id - 1);
        }
        else System.out.println("ID not found");
    }

    public void printTodo() {
        if(!todoList.isEmpty()) {
            System.out.println("Your todo list");
            for(Todo todo : todoList) {
                System.out.println(todo.stringify());
            }
        }
    }

    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        Scanner input = new Scanner(System.in);

        boolean finish = false;
        while (!finish) {
            app.printTodo();
            System.out.printf("Enter your command:%n1. add%n2. rm X (X = todo id)%n3. close%n");
            String cmd = input.nextLine();
            String[] arr_cmd = cmd.split(" ");

            if(arr_cmd[0].equals("add")) {
                System.out.println("Activity : ");
                String activity = input.nextLine();

                boolean valid = false;
                boolean reminder = false;
                while(!valid) {
                    System.out.println("Reminder : (Y/N)");
                    char reminderCh = input.next().charAt(0);

                    if (reminderCh == 'Y' || reminderCh == 'y' || reminderCh == 'N' || reminderCh == 'n') {
                        if (reminderCh == 'Y' || reminderCh == 'y') {
                            reminder = true;
                        }
                        valid = true;
                    } else System.out.println("Please try again!");
                }

                app.addTodo(activity, reminder);

            }
            else if(arr_cmd[0].equals("rm")) {
                int id = Integer.parseInt(arr_cmd[1]);
                app.removeTodo(id);
            }
            else if (arr_cmd[0].equals("close")) {
                System.out.println("App closing");
                finish = true;
            }
        }

    }
}
