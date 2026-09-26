package practice.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        // in this problem our aim is to push all the unique elements at the very beginning
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates obj =  new RemoveDuplicates();
        obj.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums){
        int l = 0;
        for (int r = 1; r<nums.length; r++){
            if (nums[l]!=nums[r]){
                nums[l+1] = nums[r];
                l++;
            }
        }

        return l+1;

    }
}
