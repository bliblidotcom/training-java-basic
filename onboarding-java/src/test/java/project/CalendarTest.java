package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    public static final Calendar calendar = new Calendar();

    @Test
    public void testJan_success(){
        String result = calendar.convertMonth(1);
        Assertions.assertEquals("January",result);
    }
    @Test
    public void testFeb_success(){
        String result = calendar.convertMonth(2);
        Assertions.assertEquals("February",result);
    }
    @Test
    public void testMar_success(){
        String result = calendar.convertMonth(3);
        Assertions.assertEquals("March",result);
    }
    @Test
    public void testApr_success(){
        String result = calendar.convertMonth(4);
        Assertions.assertEquals("April",result);
    }
    @Test
    public void testMay_success(){
        String result = calendar.convertMonth(5);
        Assertions.assertEquals("May",result);
    }
    @Test
    public void testJun_success(){
        String result = calendar.convertMonth(6);
        Assertions.assertEquals("June",result);
    }
    @Test
    public void testJul_success(){
        String result = calendar.convertMonth(7);
        Assertions.assertEquals("July",result);
    }
    @Test
    public void testAug_success(){
        String result = calendar.convertMonth(8);
        Assertions.assertEquals("August",result);
    }
    @Test
    public void testSep_success(){
        String result = calendar.convertMonth(9);
        Assertions.assertEquals("September",result);
    }
    @Test
    public void testOct_success(){
        String result = calendar.convertMonth(10);
        Assertions.assertEquals("October",result);
    }
    @Test
    public void testNov_success(){
        String result = calendar.convertMonth(11);
        Assertions.assertEquals("November",result);
    }
    @Test
    public void testDec_success(){
        String result = calendar.convertMonth(12);
        Assertions.assertEquals("December",result);
    }
    @Test
    public void test_fail(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = calendar.convertMonth(null);
            Assertions.assertEquals(6,result);
        });
    }
    @Test
    public void test_fail2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = calendar.convertMonth(13);
            Assertions.assertEquals(6,result);
        });
    }
}