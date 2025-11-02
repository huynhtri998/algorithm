package twopointer.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twopointer.backwardtraversal.Sum2BinaryString;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum2BinaryStringTest {
    private Sum2BinaryString sum2BinaryString;

    @BeforeEach
    public void setUp() {
        sum2BinaryString = new Sum2BinaryString();
    }

    @Test
    void testExample1() {
        // 11 (3) + 1 (1) = 100 (4)
        String result = sum2BinaryString.addBinary("11", "1");
        assertEquals("100", result);
    }

    @Test
    void testExample2() {
        // 1010 (10) + 1011 (11) = 10101 (21)
        String result = sum2BinaryString.addBinary("1010", "1011");
        assertEquals("10101", result);
    }

    @Test
    void testDifferentLengths() {
        // 1 (1) + 1111 (15) = 10000 (16)
        String result = sum2BinaryString.addBinary("1", "1111");
        assertEquals("10000", result);
    }

    @Test
    void testZeroCases() {
        // 0 + 0 = 0
        assertEquals("0", sum2BinaryString.addBinary("0", "0"));

        // 0 + 1 = 1
        assertEquals("1", sum2BinaryString.addBinary("0", "1"));

        // 1 + 0 = 1
        assertEquals("1", sum2BinaryString.addBinary("1", "0"));
    }
}
