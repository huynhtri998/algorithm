package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public int[] bucketSort(int[] arr) {
        int maxValue = Integer.MIN_VALUE;

        for(int value : arr){
            if(value > maxValue)
                maxValue = value;
        }

        int bucketCount = (int)Math.ceil(Math.sqrt(arr.length));

        ArrayList<Integer>[]  buckets = new ArrayList[bucketCount];

        for(int i = 0; i < bucketCount; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int value : arr){
            int bucketIndex = (int)Math.ceil((float)value * bucketCount / (float) maxValue);
            buckets[bucketIndex - 1].add(value);
        }

        for(int i = 0; i < bucketCount; i++){
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for(ArrayList<Integer> bucket : buckets){
            for(int value : bucket){
                arr[index++] = value;
            }
        }

        return arr;
    }
}
