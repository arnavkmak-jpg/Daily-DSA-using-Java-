package Dynamic_Programming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length]; // array LIS with same length as the given array
        Arrays.fill(LIS,1); // fill the array with values of 1

        for (int i = nums.length-1; i>=0; i--){ // Outer loop, iterate through each element in the array in reverse
            for (int j = i+1; j< nums.length; j++){ // Inner loop, iteration starts from right of the i index
                if (nums[i]<nums[j]){ // check if the element at j is greater than element at i
                    LIS[i] = Math.max(LIS[i], 1+LIS[j]); // if it is we add it in the new subsequence
                }
            }



        }
        int max=0; // calculating maximum value present in the LIS array
        for (int l:LIS){
            max = Math.max(max,l);
        }

        return max;

    }
}
