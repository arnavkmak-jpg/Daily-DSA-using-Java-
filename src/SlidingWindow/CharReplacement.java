package SlidingWindow;

import java.util.HashSet;

public class CharReplacement {
    public int characterReplacement(String s, int k) {
        //s = "AABABBA", k = 1

        HashSet<Character> set = new HashSet<>();
        int max=0;

        for (char c:s.toCharArray()){
            set.add(c);
        }

        for (char c:set){
            int l = 0;
            int count =0;
            for (int r = 0;r<s.length(); r++){
                if (s.charAt(r)==c){
                    count++;
                }
                while ((r-l+1)-count > k){
                    if (s.charAt(l)==c){
                        count--;
                    }
                    l++;
                }
                max = Math.max(max, r-l+1);
            }


        }

        return max;



    }
}
