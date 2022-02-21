package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.ToDoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoListTest {
    ToDoListImpl toDoList;
    
    @BeforeEach
    void createToDoList() {
        toDoList = new ToDoListImpl();    
    }

    @Test
    void add_InsertThreeValues_SizeEqualsThree() {
        toDoList.add("Halo semua");
        Assertions.assertEquals(1, toDoList.add("Halo Blibli"));
        Assertions.assertEquals(2, toDoList.add("Halo Blinterns"));
        Assertions.assertEquals(3, toDoList.todos.size());
    }

    @Test
    void update_InsertThreeValuesUpdateIdOne_ChangedMessage() {
        toDoList.add("Halo semua");
        toDoList.add("Halo Blibli");
        toDoList.add("Halo Blinterns");

        Assertions.assertTrue(toDoList.update(1, "Halo Blibli keren"));
        Assertions.assertEquals("Halo Blibli keren", toDoList.getById(1));
    }

    @Test
    void update_InsertThreeValuesUpdateIdFour_False() {
        toDoList.add("Halo semua");
        toDoList.add("Halo Blibli");
        toDoList.add("Halo Blinterns");

        Assertions.assertFalse(toDoList.update(4, "Halo Blibli keren"));
    }

    @Test
    void remove_InsertThreeValuesRemoveIdOne_TrueAndRemoved() {
        toDoList.add("Halo semua");
        toDoList.add("Halo Blibli");
        toDoList.add("Halo Blinterns");

        Assertions.assertTrue(toDoList.delete(2));
        Assertions.assertNull(toDoList.getById(2));
    }

    @Test
    void remove_InsertThreeValuesRemoveIdFive_False() {
        toDoList.add("Halo semua");
        toDoList.add("Halo Blibli");
        toDoList.add("Halo Blinterns");

        Assertions.assertFalse(toDoList.delete(5));
    }
}
