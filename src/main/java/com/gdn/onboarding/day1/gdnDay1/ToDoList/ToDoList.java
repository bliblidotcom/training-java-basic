package com.gdn.onboarding.day1.gdnDay1.ToDoList;

import org.jetbrains.annotations.NotNull;
import sun.management.resources.agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private Scanner scan = new Scanner(System.in);

    List<String> list = new ArrayList<>();

    public void printMenu() {
        System.out.println("To Do List - Suclinton");
        System.out.println("==============================");
        System.out.println("1. My To Do List");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println("4. Exit");
        System.out.print(">> ");
    }


    public boolean print() {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        else {
            System.out.println("My To Do List");
            for (int i = 1; i <= list.size();i++){
                System.out.println(i+". " +list.get(i-1));
            }
        }
        return true;
    }


    public void add(@NotNull String input) {
        if (input.isEmpty()) throw new IllegalArgumentException("To Do List must be filled");
        list.add(input);
    }


    public void remove(Integer index) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        if(index > list.size()||index < 0){
            throw new ArrayIndexOutOfBoundsException("index out of range");
        }
        else list.remove((int)index);
    }

}
