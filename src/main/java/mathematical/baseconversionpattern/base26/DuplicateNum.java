package mathematical.baseconversionpattern.base26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateNum {

    public static void main(String[] args) {
        int[] nums = {1, 8, 3, 4, 9, 6, 7, 2, 5};
        boolean check = checkDuplicateBinarySearch(nums);
        if (check) {
            System.out.println("Duplicate number found.");
        } else {
            System.out.println("No duplicate number found.");
        }
    }

    public static boolean checkDuplicate(int[] nums) {
        boolean check = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    check = true;
                    break;
                }
            }
            if (check) {
                break;
            }
        }
        return check;
    }

    public static boolean checkDuplicateHashSet(int[] nums) {
        boolean check = false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                check = true;
                break;
            }
            set.add(nums[i]);
        }
        return check;
    }

    public static boolean checkDuplicateBinarySearch(int[] nums) {
        boolean check = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            check = binarySearch(nums, nums[i], i + 1, nums.length - 1);
            if (check) {
                break;
            }
        }
        return check;
    }

    public static boolean binarySearch(int[] nums, int target,  int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return false;
    }
}
