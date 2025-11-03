package twopointer.oppositeends;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {
    // SUT (System Under Test)
    private final ValidPalindrome sut = new ValidPalindrome();

    @Test
    void example1_shouldReturnTrue() {
        // Explanation: normalized "amanaplanacanalpanama" reads the same both ways
        assertTrue(sut.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void example2_shouldReturnFalse() {
        // Explanation: "raceacar" is not a palindrome
        assertFalse(sut.isPalindrome("race a car"));
    }

    @Test
    void example3_emptyAfterCleaning_shouldReturnTrue() {
        // Explanation: after removing non-alnum → "", empty string is a palindrome
        assertTrue(sut.isPalindrome("   "));
    }

    @Test
    void digitsAndLetters_mixedCase_shouldReturnTrue() {
        // Explanation: "1a2a1" → palindrome after normalization
        assertTrue(sut.isPalindrome("1A2a1"));
    }

    @Test
    void onlyPunctuation_shouldReturnTrue() {
        // Explanation: all removed → "", considered palindrome
        assertTrue(sut.isPalindrome(".,;:!???"));
    }

    @Test
    void mixedNonAlnumInside_shouldReturnTrue() {
        // Explanation: "ab@#BA" → "abba" → palindrome
        assertTrue(sut.isPalindrome("ab@#BA"));
    }

    @Test
    void trickyCase_zeroAndP_shouldReturnFalse() {
        // Explanation: '0' (zero) != 'p', not a palindrome
        assertFalse(sut.isPalindrome("0P"));
    }

    @Test
    void singleChar_shouldReturnTrue() {
        assertTrue(sut.isPalindrome("z"));
    }

    @Test
    void longString_shouldReturnTrue() {
        String s = "No 'x' in Nixon";
        assertTrue(sut.isPalindrome(s));
    }
}
