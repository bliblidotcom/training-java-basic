package com.gdn.onboarding.java.two.assignment.todolist;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ToDoListTest {

    public static ToDoList toDoList = new ToDoList();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @Order(1)
    public void testAddTask_success() {
        toDoList.addTask("08-03-2022", "Learn Java");
        List<Task> taskList = toDoList.getTaskList();

        List<Task> expectedTaskList = new ArrayList<>();
        expectedTaskList.add(new Task("08-03-2022", "Learn Java"));

        Assertions.assertEquals(expectedTaskList.size(), taskList.size());
        Assertions.assertEquals(expectedTaskList.get(0).getDate(), taskList.get(0).getDate());
        Assertions.assertEquals(expectedTaskList.get(0).getTaskTitle(), taskList.get(0).getTaskTitle());
    }

    @Test
    public void testAddTask_invalidDay() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            toDoList.addTask("29-02-2022", "Learn Java");
            List<Task> taskList = toDoList.getTaskList();
        });
    }

    @Test
    public void testAddTask_invalidMonth() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            toDoList.addTask("29-13-2022", "Learn Java");
            List<Task> taskList = toDoList.getTaskList();
        });
    }

    @Test
    public void testAddTask_invalidDateFormat() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            toDoList.addTask("29/11/2022", "Learn Java");
            List<Task> taskList = toDoList.getTaskList();
        });
    }

    @Test
    @Order(2)
    public void testPrintTask_success() {
        toDoList.printTask();
        Assertions.assertEquals("1. 08-03-2022\tLearn Java", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPrintTask_failed() {
        Assertions.assertThrows(NullPointerException.class, ()->{
           toDoList.printTask();
        });
    }

    @Test
    @Order(4)
    public void testRemoveTask_success() {
        toDoList.removeTask(1);
        List<Task> taskList = toDoList.getTaskList();

        if(taskList.isEmpty()){
            taskList = new ArrayList<>();
        }
        List<Task> expectedTaskList = new ArrayList<>();

        Assertions.assertEquals(expectedTaskList.size(), taskList.size());
    }

    @Test
    @Order(3)
    public void testRemoveTask_failed() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->{
            toDoList.removeTask(10);
        });
    }

    @Test
    public void testRemoveTask_null_failed() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            toDoList.removeTask(1);
            List<Task> taskList = toDoList.getTaskList();
        });
    }
}