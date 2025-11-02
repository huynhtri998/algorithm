package twopointer.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LargestSumOfKContinuousElement {
    /*
    * This is the fixed size window style of Sliding window algorithm
    * */
    public int fixedSizeWindow(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }


}
