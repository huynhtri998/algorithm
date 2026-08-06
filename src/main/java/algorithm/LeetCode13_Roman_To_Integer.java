package algorithm;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13_Roman_To_Integer {

    public static void main(String[] args) {
        // XX = 20
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);
    }

    static Map<String, Integer> romanNumerals = new HashMap<>();
    static {
        romanNumerals.put("I", 1);
        romanNumerals.put("V", 5);
        romanNumerals.put("X", 10);
        romanNumerals.put("L", 50);
        romanNumerals.put("C", 100);
        romanNumerals.put("D", 500);
        romanNumerals.put("M", 1000);
        romanNumerals.put("IV", 4);
        romanNumerals.put("IX", 9);
        romanNumerals.put("XL", 40);
        romanNumerals.put("XC", 90);
        romanNumerals.put("CD", 400);
        romanNumerals.put("CM", 900);
    }

    public static int romanToInt(String s) {
        int i = 0;
        int result = 0;

        while (i < s.length()) {

            if(i + 1 < s.length()){
                String twoSymbol = s.substring(i, i + 2);
                if(romanNumerals.containsKey(twoSymbol)){
                    result += romanNumerals.get(twoSymbol);
                    i += 2;
                    continue;
                }
            }

            String oneSymbol = String.valueOf(s.charAt(i));
            result += romanNumerals.get(oneSymbol);
            i++;
        }

        return result;
    }
}
