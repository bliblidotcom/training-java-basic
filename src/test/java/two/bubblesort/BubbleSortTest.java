package two.bubblesort;

import com.gdn.bootcamp.day1assignment.two.bubblesort.BubbleSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleSortTest {
    private static BubbleSort bubbleSort;

    @BeforeAll
    public static void beforeAll() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSuccessAscendingOrder() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] actual = bubbleSort.ascendingOrder(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSuccessAscendingOrderWithOneElement() {
        Integer[] input = {1};
        Integer[] expected = {1};
        Integer[] actual = bubbleSort.ascendingOrder(input);
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testFailAscendingOrderWithNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            Integer[] input = null;
            Integer[] actual = bubbleSort.ascendingOrder(input);
        });
    }

    @Test
    public void testFailAscendingOrderWithZeroInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            Integer[] input = {};
            Integer[] actual = bubbleSort.ascendingOrder(input);
        });
    }
}
