package practice.arrays;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args){
        int[] nums = {0 , 2, 3, 1, 4};

        MissingNumbers obj = new MissingNumbers();

        System.out.println(obj.missingNumber(nums));
    }

    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if (nums[i]!=i){
                return nums[i];

            }

        }
        return nums.length;

    }
}
