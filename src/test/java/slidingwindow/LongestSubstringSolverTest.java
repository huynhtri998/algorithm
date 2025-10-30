package slidingwindow;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.trilabs94.slidingwindow.LargestSumOfKContinuousElement;
import org.trilabs94.slidingwindow.LongestSubstringSolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringSolverTest {
    private static LongestSubstringSolver solver;

    @BeforeAll
    static void init(){
        solver = new LongestSubstringSolver();
    }

    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
            "'', 0",
            "abcdef, 6"
    })
    void testBasicCases(String input, int expected) {
        assertEquals(expected, solver.dynamicSizeWindow(input)); // "abc"
    }
}
