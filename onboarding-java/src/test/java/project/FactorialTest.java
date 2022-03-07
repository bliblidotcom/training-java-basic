package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FactorialTest {

    public static final Factorial factorial = new Factorial();

    @Test
    public void test_success(){
        Integer result = factorial.compute(4);
        Assertions.assertEquals(24,result);
    }

    @Test
    public void test_fail(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer result = factorial.compute(null);
            Assertions.assertEquals(6,result);
        });
    }

    @Test
    public void test_fail2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer result = factorial.compute(-2);
            Assertions.assertEquals(6,result);
        });
    }

}