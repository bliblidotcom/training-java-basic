package com.gdn.repotutorial.repotutorial;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private List<Task> taskList = new LinkedList<Task>();

    public void menu(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("         Menu         ");
        System.out.println("----------------------");
        System.out.println("1. Tampilkan To-Do List");
        System.out.println("2. Tambah Kegiatan");
        System.out.println("3. Ubah Status Kegiatan");
        System.out.println("4. Hapus Kegiatan");
        System.out.println("0. Keluar");
        System.out.println();
        System.out.print("Enter choice: ");
    }

    public void listKegiatan(List<Task> list){
        if(list.isEmpty())
        {
            System.out.println("Belum ada Kegiatan!");
        }
        else
        {
            System.out.println("----------------------");
            System.out.println("     List Kegiatan    ");
            System.out.println("----------------------");
            int number = 1;
            for(Task task : list){
                System.out.println(number + " " + task.getTask() + "\t\t\t" + ((task.getStatus()) ? "Complete" : "Pending"));
                number++;
            }
            System.out.println("----------------------");
        }
    }

    public void addKegiatan(String task, List<Task> list){
        list.add(new Task(task, false));
    }

    public void updateKegiatan(int num, List<Task> list){
        list.get(num).setStatus(true);
    }

    public void deleteKegiatan(int num, List<Task> list){
        list.remove(num);
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scan = new Scanner(System.in);
        int num = 5;
        while (num != 0){
            toDoList.menu();
            num = scan.nextInt();
            scan.nextLine();
            switch (num) {
                case 1 :
                    toDoList.listKegiatan(toDoList.taskList);
                    break;
                case 2 :
                    System.out.println("----------------------");
                    System.out.println("     Add Kegiatan     ");
                    System.out.println("----------------------");
                    System.out.print("Input Kegiatan : ");
                    String task = scan.nextLine();
                    toDoList.addKegiatan(task, toDoList.taskList);
                    System.out.println("Kegiatan berhasil dimasukan!");
                    break;
                case 3 :
                    if(toDoList.taskList.isEmpty())
                    {
                        System.out.println("Belum ada Kegiatan!");
                    }
                    else{
                        System.out.println("----------------------");
                        System.out.println(" Ubah Status Kegiatan ");
                        System.out.println("----------------------");
                        toDoList.listKegiatan(toDoList.taskList);
                        System.out.print("Input Kegiatan : ");

                        int idx = scan.nextInt() - 1;

                        if(idx < 0 || (idx+1) > toDoList.taskList.size())
                            System.out.println("Mohon memasukan angka dengan benar!");
                        else{
                            toDoList.updateKegiatan(idx, toDoList.taskList);
                            System.out.println("----------------------");
                            System.out.println("Kegiatan berhasil diupdate!");
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 4 :
                    if(toDoList.taskList.isEmpty())
                    {
                        System.out.println("Belum ada Kegiatan!");
                    }
                    else
                    {
                        System.out.println("----------------------");
                        System.out.println("    Hapus Kegiatan    ");
                        System.out.println("----------------------");
                        toDoList.listKegiatan(toDoList.taskList);
                        System.out.print("Input Kegiatan : ");

                        int idx = scan.nextInt() - 1;

                        if(idx < 0 || (idx+1) > toDoList.taskList.size())
                            System.out.println("Mohon memasukan angka dengan benar!");
                        else{
                            toDoList.deleteKegiatan(idx, toDoList.taskList);
                            System.out.println("----------------------");
                            System.out.println("Kegiatan berhasil dihapus!");
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia, mohon masukan input sesuai menu");
                    break;
            }
        }
    }

}
