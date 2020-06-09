import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Solution S = new Solution();
        System.out.println(S.lengthOfLongestSubstring("abba"));
    }


    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int max = 0;
            int p = -1;
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    p = Math.max(p, map.get(s.charAt(i)));
                }
                max = Math.max(i - p, max);
                map.put(s.charAt(i), i);
            }
            return max;
        }
    }
}