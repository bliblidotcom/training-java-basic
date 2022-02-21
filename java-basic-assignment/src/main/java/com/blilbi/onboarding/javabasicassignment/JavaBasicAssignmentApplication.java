package com.blilbi.onboarding.javabasicassignment;

import com.blilbi.onboarding.Todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicAssignmentApplication.class, args);
		/*
		Tugas Todo
		*/
		Todo myTodo = new Todo();

		myTodo.showTodoList(myTodo.getTodo());
		
		myTodo.insertTodo("Membuat tugas Java Dasar");
		myTodo.insertTodo("Membuat Todo untuk tugas Java juga");
		myTodo.insertTodo("Membuat laporan harian");
		myTodo.showTodoList(myTodo.getTodo());

		myTodo.removeTodo(0);
		myTodo.removeTodo(5);
		myTodo.showTodoList(myTodo.getTodo());
	}
}
