package SlidingWindow;

import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
// s = "abcabcbb"
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int max = 0;

        for (int r = 0;r<s.length();r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(r));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);

        }
        return max;



    }


}
