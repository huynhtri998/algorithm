package mathematical.baseconversionpattern.base26;

import java.util.*;

public class DuplicateNum2 {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5, 1, 7, 8, 9, 1};
        int k = 4;
        boolean check = checkDuplicateSlidingWindow(nums, k);
        if (check) {
            System.out.println("Duplicate number found within the window of size " + k);
        } else {
            System.out.println("No duplicate number found within the window of size " + k);
        }
    }

    public static int[] checkDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // No duplicate found
    }
    // 2,1,5,2,5
    public static boolean checkDuplicateSlidingWindow(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
