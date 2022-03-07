package com.gdn.bootcamp.bootcamp.unitTest;

import com.gdn.bootcamp.bootcamp.month.Month;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonthTest {

    Month month;

    @BeforeEach
    public void setUp(){
        month = new Month();
    }

    @Test
    public void testConvert1_success(){
        String result = month.convert(1);
        Assertions.assertEquals(result, "January");
    }

    @Test
    public void testConvert2_success(){
        String result = month.convert(2);
        Assertions.assertEquals(result, "February");
    }

    @Test
    public void testConvert3_success(){
        String result = month.convert(3);
        Assertions.assertEquals(result, "March");
    }

    @Test
    public void testConvert4_success(){
        String result = month.convert(4);
        Assertions.assertEquals(result, "April");
    }

    @Test
    public void testConvert5_success(){
        String result = month.convert(5);
        Assertions.assertEquals(result, "May");
    }

    @Test
    public void testConvert6_success(){
        String result = month.convert(6);
        Assertions.assertEquals(result, "June");
    }

    @Test
    public void testConvert7_success(){
        String result = month.convert(7);
        Assertions.assertEquals(result, "July");
    }

    @Test
    public void testConvert8_success(){
        String result = month.convert(8);
        Assertions.assertEquals(result, "August");
    }

    @Test
    public void testConvert9_success(){
        String result = month.convert(9);
        Assertions.assertEquals(result, "September");
    }

    @Test
    public void testConvert10_success(){
        String result = month.convert(10);
        Assertions.assertEquals(result, "October");
    }


    @Test
    public void testConvert11_success(){
        String result = month.convert(11);
        Assertions.assertEquals(result, "November");
    }

    @Test
    public void testConvert12_success(){
        String result = month.convert(12);
        Assertions.assertEquals(result, "December");
    }

    @Test
    public void testConvert1_fail(){
        String result = month.convert(2);
        Assertions.assertNotEquals(result, "January");
    }

    @Test
    public void testConvert2_fail(){
        String result = month.convert(3);
        Assertions.assertNotEquals(result, "February");
    }

    @Test
    public void testConvert3_fail(){
        String result = month.convert(4);
        Assertions.assertNotEquals(result, "March");
    }

    @Test
    public void testConvert4_fail(){
        String result = month.convert(5);
        Assertions.assertNotEquals(result, "April");
    }

    @Test
    public void testConvert5_fail(){
        String result = month.convert(6);
        Assertions.assertNotEquals(result, "May");
    }

    @Test
    public void testConvert6_fail(){
        String result = month.convert(7);
        Assertions.assertNotEquals(result, "June");
    }

    @Test
    public void testConvert7_fail(){
        String result = month.convert(8);
        Assertions.assertNotEquals(result, "July");
    }

    @Test
    public void testConvert8_fail(){
        String result = month.convert(9);
        Assertions.assertNotEquals(result, "August");
    }

    @Test
    public void testConvert9_fail(){
        String result = month.convert(10);
        Assertions.assertNotEquals(result, "September");
    }

    @Test
    public void testConvert10_fail(){
        String result = month.convert(11);
        Assertions.assertNotEquals(result, "October");
    }


    @Test
    public void testConvert11_fail(){
        String result = month.convert(12);
        Assertions.assertNotEquals(result, "November");
    }

    @Test
    public void testConvert12_fail(){
        String result = month.convert(1);
        Assertions.assertNotEquals(result, "December");
    }

    @Test
    public void testConvert0_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            String result = month.convert(0);
        });
    }

    @Test
    public void testConvert13_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            String result = month.convert(13);
        });
    }
}
