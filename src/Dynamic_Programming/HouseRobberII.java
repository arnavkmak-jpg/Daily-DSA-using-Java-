package Dynamic_Programming;

import java.util.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) { // nums[0] for edge case with only 1 element in the array
        int max = Math.max(nums[0],Math.max(robHouse(Arrays.copyOfRange(nums,0,nums.length-1)),robHouse(Arrays.copyOfRange(nums,1,nums.length))));
        // copyOfRange 1- excludes the last element 2- excludes the 1st element since they are neighbours

        return max;

    }

    private int robHouse(int[] nums){
        int rob1 = 0;
        int rob2 = 0;

        for (int n:nums){
            int temp = Math.max(rob1+n,rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;

    }

}
