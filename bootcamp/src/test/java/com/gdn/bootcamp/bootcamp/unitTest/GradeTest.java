package com.gdn.bootcamp.bootcamp.unitTest;

import com.gdn.bootcamp.bootcamp.grade.Grade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeTest {
        Grade grade;

        @BeforeEach
        public void setUp(){
            grade = new Grade();
        }

        @Test
        public void testValidate1_success(){
            Boolean result = grade.validate(0);
            Assertions.assertEquals(result, true);
        }

    @Test
    public void testValidate2_success(){
        Boolean result = grade.validate(100);
        Assertions.assertEquals(result, true);
    }

    @Test
    public void testValidate1_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            grade.validate(-1);
        });
    }

    @Test
    public void testValidate2_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            grade.validate(101);
        });
    }

    @Test
    public void testValidate3_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            grade.validate(null);
        });
    }

    @Test
    public void testConvertGrade1_success(){
        String result = grade.convertGrade(49);
        Assertions.assertEquals(result, "F");
    }

    @Test
    public void testConvertGrade2_success(){
        String result = grade.convertGrade(59);
        Assertions.assertEquals(result, "E");
    }

    @Test
    public void testConvertGrade3_success(){
        String result = grade.convertGrade(69);
        Assertions.assertEquals(result, "D");
    }

    @Test
    public void testConvertGrade4_success(){
        String result = grade.convertGrade(79);
        Assertions.assertEquals(result, "C");
    }

    @Test
    public void testConvertGrade5_success(){
        String result = grade.convertGrade(89);
        Assertions.assertEquals(result, "B");
    }

    @Test
    public void testConvertGrade6_success(){
        String result = grade.convertGrade(100);
        Assertions.assertEquals(result, "A");
    }
}
