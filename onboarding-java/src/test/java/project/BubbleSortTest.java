package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    public static final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void test_success(){
        Integer[] test_data = {1,5,2,3,4};
        Integer[] result = bubbleSort.sort(test_data);

        Integer[] expected = {1,2,3,4,5};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void test_fail(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer[] result = bubbleSort.sort(null);
            Integer[] expected = {1,2,3,4,5};
            Assertions.assertEquals(expected, result);
        });
    }
}