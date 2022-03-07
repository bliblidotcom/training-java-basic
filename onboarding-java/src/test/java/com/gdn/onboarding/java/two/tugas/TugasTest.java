package com.gdn.onboarding.java.two.tugas;

import com.gdn.onboarding.java.two.calc.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TugasTest {

    private static final Tugas tugas = new Tugas();

    @Test
    public void gradeFailed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String result = tugas.grade(null);

            Assertions.assertEquals("F", result);
        });
    }

    @Test
    public void gradeF(){
        String result = tugas.grade(1);

        Assertions.assertEquals("F", result);
    }

    @Test
    public void gradeE(){
        String result = tugas.grade(50);

        Assertions.assertEquals("E", result);
    }

    @Test
    public void gradeD(){
        String result = tugas.grade(60);

        Assertions.assertEquals("D", result);
    }

    @Test
    public void gradeC(){
        String result = tugas.grade(70);

        Assertions.assertEquals("C", result);
    }

    @Test
    public void gradeB(){
        String result = tugas.grade(80);

        Assertions.assertEquals("B", result);
    }

    @Test
    public void gradeA(){
        String result = tugas.grade(90);

        Assertions.assertEquals("A", result);
    }

    @Test
    public void calendarNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String result = tugas.calendar(null);

            Assertions.assertEquals("January", result);
        });
    }

    @Test
    public void calendarLT1(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String result = tugas.calendar(0);

            Assertions.assertEquals("January", result);
        });
    }

    @Test
    public void calendarGT12(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            String result = tugas.calendar(13);

            Assertions.assertEquals("December", result);
        });
    }

    @Test
    public void calendar1(){
        String result = tugas.calendar(1);

        Assertions.assertEquals("January", result);
    }

    @Test
    public void calendar2(){
        String result = tugas.calendar(2);

        Assertions.assertEquals("February", result);
    }

    @Test
    public void calendar3(){
        String result = tugas.calendar(3);

        Assertions.assertEquals("March", result);
    }

    @Test
    public void calendar4(){
        String result = tugas.calendar(4);

        Assertions.assertEquals("April", result);
    }

    @Test
    public void calendar5(){
        String result = tugas.calendar(5);

        Assertions.assertEquals("May", result);
    }

    @Test
    public void calendar6(){
        String result = tugas.calendar(6);

        Assertions.assertEquals("June", result);
    }

    @Test
    public void calendar7(){
        String result = tugas.calendar(7);

        Assertions.assertEquals("July", result);
    }

    @Test
    public void calendar8(){
        String result = tugas.calendar(8);

        Assertions.assertEquals("August", result);
    }

    @Test
    public void calendar9(){
        String result = tugas.calendar(9);

        Assertions.assertEquals("September", result);
    }

    @Test
    public void calendar10(){
        String result = tugas.calendar(10);

        Assertions.assertEquals("October", result);
    }

    @Test
    public void calendar11(){
        String result = tugas.calendar(11);

        Assertions.assertEquals("November", result);
    }

    @Test
    public void calendar12(){
        String result = tugas.calendar(12);

        Assertions.assertEquals("December", result);
    }

    @Test
    public void factorialFailed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Integer result = tugas.factorial(null);

            Assertions.assertEquals(20, result);
        });
    }

    @Test
    public void factorial2(){
        Integer result = tugas.factorial(2);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void factorial3(){
        Integer result = tugas.factorial(3);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void factorial4(){
        Integer result = tugas.factorial(4);

        Assertions.assertEquals(24, result);
    }

    @Test
    public void factorial5(){
        Integer result = tugas.factorial(5);

        Assertions.assertEquals(120, result);
    }

    @Test
    public void bubble1(){
        Integer[] unsorted = {3, 1, 2};

        Integer[] result = tugas.bubble(unsorted);

        Integer[] sorted = {1, 2, 3};

        Assertions.assertArrayEquals(sorted, result);
    }

    @Test
    public void bubble2(){
        Integer[] unsorted = {4, 3, 2, 1};

        Integer[] result = tugas.bubble(unsorted);

        Integer[] sorted = {1, 2, 3, 4};

        Assertions.assertArrayEquals(sorted, result);
    }

    @Test
    public void todo(){
        List<String> list = new ArrayList<>();
        list.add("Todo A");
        list.add("Todo B");
        list.add("Todo C");
        list.remove("Todo B");

        List<String> result = new ArrayList<>();
        result = tugas.add(result, "Todo A");
        result = tugas.add(result, "Todo B");
        result = tugas.add(result, "Todo C");
        tugas.print(result);
        result = tugas.remove(result, "Todo B");

        Assertions.assertEquals(list, result);
    }
}
