package com.gdn.onboarding.day1.gdnDay1.ToDoList;

import com.gdn.onboarding.day1.gdnDay1.Calendar.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


class ToDoListTest {
    public Logger log = LoggerFactory.getLogger(ToDoList.class);

    List<String> list = new ArrayList<>();
    ToDoList tdl = new ToDoList();

    @Test
    void addTest(){
        list.add("test");
        tdl.add("test");
        Assertions.assertEquals(list.size(),tdl.list.size());
    }

    @Test
    void addTest2(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            tdl.add(null);
        });
    }

    @Test
    void removeTest(){
        list.add("test1");
        tdl.add("test");
        tdl.add("test1");
        tdl.remove(0);
        Assertions.assertEquals(list.get(0),tdl.list.get(0));
    }

    @Test
    void removeTest2(){
        tdl.add("test");
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            tdl.remove(-2);
        });
    }

    @Test
    void removeTest3(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            tdl.remove(null);
        });
    }

    @Test
    void printTest(){
        tdl.add("test");
        Assertions.assertTrue(tdl.print());
    }

    @Test
    void printTest2(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Assertions.assertTrue(tdl.print());
        });
    }
}