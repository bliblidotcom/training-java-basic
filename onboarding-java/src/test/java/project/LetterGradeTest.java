package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LetterGradeTest {
    public static final LetterGrade letterGrade = new LetterGrade();

    @Test
    public void testA_success(){
        String result = letterGrade.convertGrade(100);
        Assertions.assertEquals("A",result);
    }

    @Test
    public void testAMin_success(){
        String result = letterGrade.convertGrade(85);
        Assertions.assertEquals("A-",result);
    }

    @Test
    public void testB_success(){
        String result = letterGrade.convertGrade(70);
        Assertions.assertEquals("B",result);
    }

    @Test
    public void testC_success(){
        String result = letterGrade.convertGrade(60);
        Assertions.assertEquals("C",result);
    }

    @Test
    public void testD_success(){
        String result = letterGrade.convertGrade(40);
        Assertions.assertEquals("D",result);
    }

    @Test
    public void test_fail(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = letterGrade.convertGrade(null);
            Assertions.assertEquals("D",result);
        });
    }
}