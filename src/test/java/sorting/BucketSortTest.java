package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BucketSortTest {
    private BucketSort bucketSort;

    @BeforeEach
    public void setup() {
        bucketSort = new BucketSort();
    }

    @Test
    void normalBubbleSort(){
        int[] arrInput = {4,1,6,2,5,3,9,7,8};
        int[] expectedOutput = {1,2,3,4,5,6,7,8,9};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void alreadySortedArray() {
        int[] arrInput = {1,2,3,4,5};
        int[] expectedOutput = {1,2,3,4,5};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void reverseSortedArray() {
        int[] arrInput = {5,4,3,2,1};
        int[] expectedOutput = {1,2,3,4,5};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void arrayWithDuplicates() {
        int[] arrInput = {5,1,3,3,2,1};
        int[] expectedOutput = {1,1,2,3,3,5};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void arrayWithSingleElement() {
        int[] arrInput = {42};
        int[] expectedOutput = {42};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void emptyArray() {
        int[] arrInput = {};
        int[] expectedOutput = {};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void arrayWithAllEqualNumbers() {
        int[] arrInput = {5,5,5,5};
        int[] expectedOutput = {5,5,5,5};
        int[] result = bucketSort.bucketSort(arrInput);
        assertArrayEquals(expectedOutput, result);
    }
}
