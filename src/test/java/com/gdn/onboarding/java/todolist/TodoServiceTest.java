package com.gdn.onboarding.java.todolist;

import com.gdn.onboarding.java.todolist.model.Todo;
import com.gdn.onboarding.java.todolist.service.TodoService;
import com.gdn.onboarding.java.todolist.service.impl.TodoServiceImpl;
import javafx.util.converter.LocalDateStringConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;

public class TodoServiceTest {

    TodoService todoService = new TodoServiceImpl();

    @Test
    public void addTodoTest(){
        Todo todo = new Todo("Tidur", "Tidur", LocalDate.now());
        todoService.addTodo(todo);
        Vector<Todo> todos = todoService.getTodos();
        Assertions.assertEquals(todo, todos.get(0));
    }

    @Test
    public void getTodosTest(){
        Todo todo = new Todo("Tidur", "Tidur", LocalDate.now());
        Todo todo2 = new Todo("Nonton", "Nonton", LocalDate.now());

        Vector<Todo> todos = new Vector<>();
        todos.add(todo);
        todos.add(todo2);

        todoService.addTodo(todo);
        todoService.addTodo(todo2);
        Assertions.assertEquals(todos, todoService.getTodos());
    }

    @Test
    public void getTodobyIndexTest() {
        Todo todo = new Todo("Tidur", "Tidur", LocalDate.now());
        Todo todo2 = new Todo("Nonton", "Nonton", LocalDate.now());

        todoService.addTodo(todo);
        todoService.addTodo(todo2);
        Assertions.assertEquals(todo2, todoService.getTodobyIndex(1));
    }

    @Test
    public void deleteTodobyIndexTest(){
        Todo todo = new Todo("Tidur", "Tidur", LocalDate.now());
        Todo todo2 = new Todo("Nonton", "Nonton", LocalDate.now());

        todoService.addTodo(todo);
        todoService.addTodo(todo2);

        Vector<Todo> todos = new Vector<>();
        todos.add(todo2);

        todoService.deleteTodobyIndex(0);
        Assertions.assertEquals(todos, todoService.getTodos());
    }

    @Test
    public void deletebyTodoTest(){
        Todo todo = new Todo("Tidur", "Tidur", LocalDate.now());
        Todo todo2 = new Todo("Nonton", "Nonton", LocalDate.now());

        todoService.addTodo(todo);
        todoService.addTodo(todo2);

        Vector<Todo> todos = new Vector<>();
        todos.add(todo2);

        todoService.deletebyTodo(todo);
        Assertions.assertEquals(todos, todoService.getTodos());
    }


}
