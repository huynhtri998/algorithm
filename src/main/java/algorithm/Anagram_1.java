package algorithm;

public class Anagram_1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "gramana";
        boolean result = isAnagram(s, t);
        if (result) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }

    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;

        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            int sIndex = s.charAt(i) - 'a';
            int tIndex = t.charAt(i) - 'a';

            arr[sIndex]++;
            arr[tIndex]--;
        }

        for(int value : arr){
            if(value != 0) return false;
        }

        return true;
    }
}
