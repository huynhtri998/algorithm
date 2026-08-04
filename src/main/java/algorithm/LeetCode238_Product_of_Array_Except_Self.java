package algorithm;

import java.util.Arrays;

public class LeetCode238_Product_of_Array_Except_Self {
    public static void main (String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println("Product of array except self: " + Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];

        int prefix = 1;
        /*
        *   1,0,0,0 0 1
        *   1,1,0,0 1 2
        *   1,1,2,0 2 6
        *   1,1,2,6 3 24
        *
        * */
        for(int i = 0; i < n; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        /*
        *   1,1,2,6 3 4
        *   1,1,8,6 2 12
        *   1,12,8,6 1 24
        *   24,12,8,6 0 24
        *
        * */

        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }

}
