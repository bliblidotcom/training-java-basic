package com.gdn.repotutorial.repotutorial;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private static List<String> toDoList = new LinkedList<String>();

    public static void menu(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("         Menu         ");
        System.out.println("----------------------");
        System.out.println("1. Tampilkan To-Do List");
        System.out.println("2. Tambah Kegiatan");
        System.out.println("3. Hapus Kegiatan");
        System.out.println("0. Keluar");
        System.out.println();
        System.out.print("Enter choice: ");
    }

    public static void  listKegiatan(){
        if(toDoList.isEmpty())
        {
            System.out.println("Belum ada Kegiatan!");
        }
        else
        {
            System.out.println("----------------------");
            System.out.println("     List Kegiatan    ");
            System.out.println("----------------------");
            int number = 1;
            for(String task : toDoList){
                System.out.println(number + " " + task);
                number++;
            }
            System.out.println("----------------------");
        }
    }

    public static void addKegiatan(){
        System.out.println("----------------------");
        System.out.println("     Add Kegiatan     ");
        System.out.println("----------------------");
        System.out.print("Input Kegiatan : ");
        Scanner scan = new Scanner(System.in);
        String task = scan.nextLine();
        toDoList.add(task);
        System.out.println("Kegiatan berhasil dimasukan!");
    }

    public static void deleteKegiatan(){
        if(toDoList.isEmpty())
        {
            System.out.println("Belum ada Kegiatan!");
        }
        else
        {
            System.out.println("----------------------");
            System.out.println("    Hapus Kegiatan    ");
            System.out.println("----------------------");
            listKegiatan();
            System.out.print("Input Kegiatan : ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt() - 1;

            if(num < 0 || (num+1) > toDoList.size())
                System.out.println("Mohon memasukan angka dengan benar!");
            else{
                toDoList.remove(num);
                System.out.println("----------------------");
                System.out.println("Kegiatan berhasil dihapus!");
                System.out.println("----------------------");
            }
        }
    }

    public static void main(String[] args) {
        toDoList.add("Welcoming Day");
        toDoList.add("HR Bootcamp");
        toDoList.add("FUTURE Bootcamp");

        Scanner scan = new Scanner(System.in);
        int num = 4;
        while (num != 0){
            ToDoList.menu();
            num = scan.nextInt();
            switch (num) {
                case 1 :
                    listKegiatan();
                    break;
                case 2 :
                    addKegiatan();
                    break;
                case 3 :
                    deleteKegiatan();
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
