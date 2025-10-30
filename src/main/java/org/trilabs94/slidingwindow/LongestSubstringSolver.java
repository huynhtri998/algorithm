package org.trilabs94.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringSolver {
    /*
     * This is a dynamic size window style of Sliding window algorithm
     * */
    public int dynamicSizeWindow(String str) {
        int left = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();

        for (int right=0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left++));
            }

            set.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
