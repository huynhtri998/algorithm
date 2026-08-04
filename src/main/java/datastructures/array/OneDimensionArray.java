package datastructures.array;

import java.util.Arrays;

public class OneDimensionArray {
    public static void main(String[] sts){
        /*
        * It's a simplest array with 1 row and multiple column.
        * Each element inside an array is created with only one number which present for an index
        *
        * */

        int[] arr = new int[]{1,2,3,4,5};
        String[] strs = {"Apple", "Banana", "Coconut"};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strs));


        /*------------------------------------
        *              INSERT                 *
        * ------------------------------------*/

        /*
        * Because each element has 1 independent index value, so we can use it to add, edit and delete a specific element
        *
        * */
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        /*
        * In case you added full element to the array, and you want to add more element.
        * you have to create a  new array with double of length, then copy the existing element inside the existing array to the new one.
        *
        * */

        int[] arr3 = new int[arr2.length * 2];

        for (int i = 0; i < arr2.length; i++){
            arr3[i] = arr2[i];
        }

        arr3[5] = 6;

        System.out.println(Arrays.toString(arr3));

        /*-----------------------------
        *            ACCESS           *
        * ----------------------------*/

        /*
        * To access a specific element in one array. We have to understand how memory oganize the array in memmory location.
        * So when you create an array with 3 element. The reference value of an array will point to the first element of that array.
        * Let say you have an oganization array in memory like this:
        * Location   Value
        * 0x1000        1
        * 0x1004        2
        * 0x1008        3
        *
        * They are continuously in memory and can be accessed through index. This value is using to caculate the actual memory location of the value
        * This is the common formular to caculate actual memory from an index.
        * Actual memory location  = Starting memory location (first element) + (i * the size of each element)
        *
        * for example: you created an int array, so each int element has 4 byte.
        *              An array is strored at the memory location of 0x1000( this is the memmory location of the first element and the refenrence value)
        *
        * From that, when you want to access the element 3. computer will use that formular to caculate the actual memory of element 3 and access to get
        * value for you.
        *
        * Actual memory of element 3 = 0x1000 + (3 * 4) = 0x1000 + 12 = 0x100C(0x1012)
        * */

        System.out.println(arr3[3]);

        /*--------------------------------------------------
        *       ARRAY TRAVERSAL, FIND ELEMENT, DELETING     *
        *-------------------------------------------------- */

        /*
        *  You can use for-loop, for enhance, while, while-loop to traversal an array
        *  The idea is you will initialize 1 integer i which present for index of each element.
        *  Use it to loop through an array and get the element's value.
        *  Behind the scene, computer will use the accessing formular to find the actual memory of each element and get it's value
        *
        * */

        for (int j : arr3) {
            System.out.print(j + " ");
        }
        System.out.println();

        /*
        *  You can use the same strategy to find 1 specific element
        *
        * */

        for (int j : arr3) {
            if (arr3[j] == 6){
                System.out.println(arr3[j]);
            }
        }

        /*
        * In Array, we don't actually delete 1 element in memory. Because array is a continuous memory location
        * if you delete on specific location, an array will be broken.
        * So we only can set an element to 0
        *
        * */
        for (int j : arr3) {
            if (arr3[j] == 6){
                arr3[j] = 0;
            }
        }

        System.out.print(Arrays.toString(arr3));
    }
}
