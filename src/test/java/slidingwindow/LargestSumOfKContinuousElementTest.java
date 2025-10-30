package slidingwindow;

import org.junit.jupiter.api.*;
import org.trilabs94.slidingwindow.LargestSumOfKContinuousElement;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LargestSumOfKContinuousElementTest {

    @Test
    @DisplayName("testNormalCase")
    @Order(1)
    void testNormalCase(){
        LargestSumOfKContinuousElement algo = new LargestSumOfKContinuousElement();
        int[] arr = {2, 1, 5, 1, 3, 2};
        assertEquals(9, algo.fixedSizeWindow(arr, 3)); // {5,1,3} = 9
    }

    @Test
    @DisplayName("testAllPositive")
    void testAllPositive() {
        LargestSumOfKContinuousElement algo = new LargestSumOfKContinuousElement();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(12, algo.fixedSizeWindow(arr, 3)); // {3,4,5} = 12
    }

    @Test
    @DisplayName("testWindowSizeOne")
    @Order(2)
    void testWindowSizeOne() {
        LargestSumOfKContinuousElement algo = new LargestSumOfKContinuousElement();
        int[] arr = {1, 7, 3, 2, 9};
        assertEquals(9, algo.fixedSizeWindow(arr, 1));
    }
}
