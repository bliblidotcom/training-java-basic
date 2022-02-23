package com.gdn.onboarding.onboardingjava;

import java.util.*;

public class TodoList {
    private HashMap<String, Boolean> todoList = new HashMap<>();
    private List<String> indexedKey = new LinkedList<>();

    private TodoList() {
    }

    private static class TodoListHelper {
        private static final TodoList INSTANCE = new TodoList();
    }

    public boolean add(String key) {
        if (todoList.get(key) != null) {
            return false;
        } else {
            todoList.put(key, false);
            indexedKey.add(key);
            return true;
        }
    }

    public boolean remove(int index) {
        if (index > todoList.size() || index < 0) {
            return false;
        }

        String key = indexedKey.get(index);
        if (todoList.get(key) != null) {
            todoList.remove(key);
            indexedKey.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean complete(int index) {
        if (index > todoList.size() || index < 0) {
            return false;
        }

        String key = indexedKey.get(index);
        if (todoList.get(key) != null && !todoList.get(key)) {
            todoList.put(key, true);
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, Boolean> getTodoList() {
        return todoList;
    }

    public static TodoList getInstance() {
        return TodoListHelper.INSTANCE;
    }

    public static void main(String[] args) {
        TodoList tl = TodoList.getInstance();
        Scanner sc = new Scanner(System.in);

        int input;
        boolean loop = true;

        tl.add("dummy 1");
        tl.add("dummy 2");

        while (loop) {
            //daftar todolist
            int index = 0;
            System.out.println("id  |  todolist  |  status");
            for (Map.Entry<String, Boolean> entry : tl.getTodoList().entrySet()) {
                System.out.printf("%d: %s ", ++index, entry.getKey());
                System.out.printf("%s\n", entry.getValue() ? "Finished" : "Ongoing");
            }

            System.out.println("=================");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Complete");
            System.out.println("0. Exit Program");
            System.out.print("Opsi: ");

            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    System.out.print("Name : ");
                    String key = sc.nextLine();
                    tl.add(key);
                    break;
                case 2:
                    System.out.print("ID : ");
                    input = sc.nextInt();
                    tl.remove(input-1);
                    break;
                case 3:
                    System.out.print("ID : ");
                    input = sc.nextInt();
                    tl.complete(input-1);
                    break;
                default:
                    System.out.println("No option exists");
            }
            System.out.println();
        }

    }
}
