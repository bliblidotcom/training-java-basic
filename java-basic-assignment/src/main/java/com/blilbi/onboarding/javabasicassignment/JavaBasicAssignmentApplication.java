package com.blilbi.onboarding.javabasicassignment;

import com.blilbi.onboarding.Factorial;
import com.blilbi.onboarding.LetterGrade;
import com.blilbi.onboarding.MonthCustomCalendar;
import com.blilbi.onboarding.Todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicAssignmentApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JavaBasicAssignmentApplication.class, args);
		
		/*
		 * Tugas Letter Grade
		 */
		LetterGrade myScore = new LetterGrade(89);
		System.out.println(myScore.getGrade());
		
		/*
		 * Tugas Calendar
		 */
		MonthCustomCalendar myMonth = new MonthCustomCalendar(1);
		System.out.println(myMonth.getMonth());

		/*
		 * Tugas Factorial
		 */
		Factorial myFactorial = new Factorial(6);
		System.out.println(myFactorial.getFactorial());

		/*
		 * Tugas Todo
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
