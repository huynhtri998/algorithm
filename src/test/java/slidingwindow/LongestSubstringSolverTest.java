package slidingwindow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.trilabs94.slidingwindow.LargestSumOfKContinuousElement;
import org.trilabs94.slidingwindow.LongestSubstringSolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringSolverTest {

    // Instance of the class under test
    private final LongestSubstringSolver solver = new LongestSubstringSolver();

    @Test
    void testBasicCases() {

        // Case 1: Normal string with repeating pattern
        assertEquals(3, solver.dynamicSizeWindow("abcabcbb")); // "abc"

        // Case 2: All characters the same
        assertEquals(1, solver.dynamicSizeWindow("bbbbb")); // "b"

        // Case 3: Mixed pattern with repeats
        assertEquals(3, solver.dynamicSizeWindow("pwwkew")); // "wke"

        // Case 4: Empty string
        assertEquals(0, solver.dynamicSizeWindow(""));

        // Case 5: All unique characters
        assertEquals(6, solver.dynamicSizeWindow("abcdef"));
    }
}
