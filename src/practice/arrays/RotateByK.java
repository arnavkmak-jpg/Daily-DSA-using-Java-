package practice.arrays;

import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args){
        int[] nums = {3, 4, 1, 5, 3, -5};

        RotateByK obj = new RotateByK();
        obj.rotateLeft(nums, 8);
        System.out.println(Arrays.toString(nums));

    }

    public void rotateLeft(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        int[] temp = new int[k]; // temp array to store all the elements that goes to the end

        for(int i = 0; i<k; i++){ // iterate through the array k times and store the 1st k elements in the temp array
            nums[i] = temp[i];
        }

        for(int j = k; j<n; j++){ // shift the remaining elements to the left by k places
            nums[j-k] = nums[j];
        }

        for(int l = n-k; l<n; l++){ // put the elements from the temp at the end of the array
            nums[l] = temp[l-(n-k)];

        }


    }
}
