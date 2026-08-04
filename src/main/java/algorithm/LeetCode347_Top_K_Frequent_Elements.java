package algorithm;

import java.util.*;

public class LeetCode347_Top_K_Frequent_Elements {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        int[] result = topKFrequentMinHeap(nums, k);

        System.out.println(Arrays.toString(result));

    }

    public static int[] topKFrequentSorting(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(
                    num,
                    map.getOrDefault(num, 0)+1
            );
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(
                (a, b) -> Integer.compare(
                        map.get(b),
                        map.get(a)
                )
        );

        int[] answer = new int[k];

        for(int i = 0; i < k; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static int[] topKFrequentMinHeap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(
                    num,
                    map.getOrDefault(num, 0)+1
            );
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(map.get(a), map.get(b))
        );

        for(int key : map.keySet()){
            heap.offer(key);

            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] answer = new int[k];

        for(int i = 0; i < k; i++){
            answer[i] = heap.poll();
        }

        return answer;
    }

}
