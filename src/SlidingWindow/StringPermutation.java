package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;

public class StringPermutation {
    public boolean checkInclusion(String s1, String s2) {
        //s1 = "ab", s2 = "eidola"
        int[] c1 = new int[26];
        int[] c2 = new int[26]; // integer array of size 26 to keep count of all alphabets a-z present in the given strings

        for (char c:s1.toCharArray()){ //iterating each element in s1
            c1[c-'a']++;  // picking each element and performing ascii arithmetic where 'a' == 97

        }

        int l=0;  //initialising left pointer

        for (int r = 0;r<s2.length();r++){ //initialising right pointer
            c2[s2.charAt(r)-'a']++; // putting the count of each element present in the s2 array to c2 array
            if ((r-l+1)>s1.length()){ // check if the difference between left and right pointer exceeds length of s1 since it should be exactly equal to lenght of the array
                c2[s2.charAt(l)-'a']--; //removing 1 count from the element that was present at the left pointer
                l++; //increasing index of left pointer by 1
            }

            if ((r-l+1)==s1.length() && Arrays.equals(c1,c2)){ //check if difference between 2 pointers that is length of current substring equals length of s1 and if both our arrays have equal values
                return true; //return true if condition satisfies
            }

        }
        return false; //return false if conditions don't meet



    }
}
