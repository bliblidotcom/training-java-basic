package com.gdn.basic.trainingjavabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    private static List<String> list=new ArrayList<String>();
    private static Scanner in = new Scanner(System.in);

    public static List<String> getList() {
        return list;
    }

    public String menu(){
        return "    Menu    \n" +
                "1. View TODOs\n" +
                "2. Add TODO\n" +
                "3. Edit TODO\n" +
                "4. Delete TODO\n" +
                "0. Exit\n" +
                "Enter Choice: ";
    }

    public String viewTodo(){
        String result = new String();
        result = "TODO List:\n";
        int n = 1;
        for(String loop:list){
            result += n++ +". "+ loop + "\n";
        }
        return result;
    }

    public String addTodo(){
        System.out.print("Input new Todo: ");
        in.nextLine();
        String input = in.nextLine();
        list.add(input);
        return "added "+input+"\n";
    }

    public String editTodo(){
        System.out.println(viewTodo());
        System.out.print("masukkan urutan todo yang ingin di edit: ");
        int input = in.nextInt();
        input--;
        if(input<0 || input >= list.size()){
            return "Invalid input.";
        }
        System.out.print("Input new Todo: ");
        String str = new String();
        in.nextLine();
        str = in.nextLine();
        list.set(input,str);
        return "Edited Todo list:\n" + viewTodo();
    }

    public String deleteTodo(){
        System.out.println(viewTodo());
        System.out.print("masukkan urutan todo yang ingin di hapus: ");
        int input = in.nextInt();
        input--;
        if(input<0 || input >= list.size()){
            return "Invalid input.";
        }
        list.remove(input);
        return "Todo Deleted\nnew Todo:\n"+viewTodo();
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        int input;
        loop: while (true){
            System.out.print(todoList.menu());
            input = in.nextInt();
            switch (input) {
                case 0:
                    break loop;
                case 1:
                    System.out.println(todoList.viewTodo());
                    System.out.println("input number to continue");
                    in.nextInt();
                    break;
                case 2:
                    System.out.println(todoList.addTodo());
                    System.out.println("input number to continue");
                    in.nextInt();
                    break;
                case 3:
                    System.out.println(todoList.editTodo());
                    System.out.println("input number to continue");
                    in.nextInt();
                    break;
                case 4:
                    System.out.println(todoList.deleteTodo());
                    System.out.println("input number to continue");
                    in.nextInt();
                    break;
                default:
                    System.out.println("invalid input");
                    System.out.println("input number to continue");
                    in.nextInt();
            }
        }
    }
}
