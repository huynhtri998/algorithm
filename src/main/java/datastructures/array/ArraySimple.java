package datastructures.array;

import java.util.Arrays;

public class ArraySimple {
    public static void main(String[] args) {
        /*
        * Array is a Linear data structure
        * It's a set of location which stand continuously in the memory when it's created.
        * each element inside an array will have a unique index which is it identification. Starting with 0
        * the element is near each other and continuously.
        * Like you created an integer array. So the first element is at the memory location of an array
        * and it has 4 bit, so the next element will continuously increase 4 bit from the previous one, Like this
        * [  1  ,   2  ,   3  ]
        * [00100, 00104, 00108]
        *
        *Finally, The array can only be created with 1 datatype at the initialization, can't be changed after initialization
        * For size, It's the same. Array is fixed size, so when you create it with 5 element, you can't extend it in the future.
        * If you want, you have to create another array with your expectation and copy the element from existing one to the new one.
        *
        * Array types:
        *
        * There are several type of Array:
        *
        * 1 Dimension Array
        * 2 Dimension Array
        * 3 Dimension Array
        * MultiDimension Array
        *
        * */


        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = new int[5];

        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        arr3[3] = 4;
        arr3[4] = 5;

        System.out.println(Arrays.toString(arr3));

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
