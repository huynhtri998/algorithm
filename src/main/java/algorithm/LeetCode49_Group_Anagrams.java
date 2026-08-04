package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCode49_Group_Anagrams {
    public static void main(String[] args) {
        //["eat","tea","tan","ate","nat","bat"]
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("eat");
        strs.add("tea");
        strs.add("tan");
        strs.add("ate");
        strs.add("nat");
        strs.add("bat");

        ArrayList<ArrayList<String>> result = optimalAnagrams(strs);
        System.out.println(result);

    }

    public static ArrayList<ArrayList<String>> groupAnagrams(ArrayList<String> strs) {
        if (strs.isEmpty()) return new ArrayList<>();

        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedWord = new String(chars);
            if(!groups.containsKey(sortedWord)){
                groups.put(sortedWord, new ArrayList<>());
            }

            groups.get(sortedWord).add(word);
        }

        return new ArrayList<>(groups.values());
    }

    public static ArrayList<ArrayList<String>> optimalAnagrams(ArrayList<String> strs) {
        if(strs.isEmpty()) return new ArrayList<>();

        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for(String word : strs){
            char[] chars = new char[26];

            for(char c : word.toCharArray()){
                chars[c - 'a']++;
            }

            String frequencyKey = new String(chars);

            if(!groups.containsKey(frequencyKey)){
                groups.put(frequencyKey, new ArrayList<>());
            }

            groups.get(frequencyKey).add(word);
        }


        return new ArrayList<>(groups.values());
    }
}
