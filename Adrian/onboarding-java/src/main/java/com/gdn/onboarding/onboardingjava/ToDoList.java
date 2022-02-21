package com.gdn.onboarding.onboardingjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static List<String> list = new ArrayList<String>();

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("To do list App : ");
        System.out.println("Instructions : ");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Show All");
        System.out.println("5. Exit");

        while(true){
            System.out.println("To do list instruction : ");
            int instructions= sc.nextInt();

            if(instructions == 1){
                sc.nextLine();
                System.out.println("Please input to do task :");
                String str= sc.nextLine();
                ToDoList.add(str);
            }
            else if(instructions == 2){
                System.out.println("Please input to do list index :");
                int index= sc.nextInt();
                sc.nextLine();
                System.out.println("Please input to do task :");
                String str= sc.nextLine();
                ToDoList.edit(index, str);
            }
            else if(instructions == 3){
                System.out.println("Please input to do list index :");
                int index= sc.nextInt();
                ToDoList.delete(index);
            }
            else if(instructions == 4){
                ToDoList.showAll();
            }
            else if(instructions == 5){
                break;
            }
            else System.out.println("Please input the correct instruction");
        }
    }

    public static void add(String input){
        ToDoList.list.add(input);
        System.out.println("Input has successfully added");
    }

    public static void edit(int index, String input){
        ToDoList.list.set( index-1, input );
        System.out.println("Input has successfully edited");
    }

    public static void delete(int index){
        ToDoList.list.remove( index-1);
        System.out.println("Input has successfully deleted");
    }

    public static void showAll(){
        if(ToDoList.list.size() > 0){
            for (int i = 0; i < ToDoList.list.size(); i++){
                System.out.println((i+1) + ". " + ToDoList.list.get(i));
            }
        }
        else System.out.println("No item found");
    }
}
