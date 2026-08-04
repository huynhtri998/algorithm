package algorithm.base26;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 4, 7, 8, 9, 11};
        int target = 19;
        int[] result = twoSumHashMap(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (complement == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1}; // Placeholder return value
    }

    public static int[] twoSumSorted(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            int index = binarySeach(nums, complement, i + 1, nums.length - 1);
            if (index != -1) {
                return new int[]{i, index};
            }
        }
        return new int[]{-1, -1};
    }

    public static int binarySeach(int[] nums, int complement, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == complement) {
                return mid;
            } else if (nums[mid] < complement) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Not found

    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
