package practice.arrays;

import java.util.Arrays;

public class RotateByKOptimised {
    public static void main(String[] args){
        int[] nums = {3, 4, 1, 5, 3, -5};

        RotateByKOptimised obj = new RotateByKOptimised();
        obj.rotateLeft(nums, 8);
        System.out.println(Arrays.toString(nums));

    }

    public void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public void rotateLeft(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, k-1); // reverse the elements that is to be put at the end
        reverse(nums, k, n-1); // reverse the elements that are to be shifted to k places to the left
        reverse(nums, 0 , n-1); // reverse the entire array



    }
}
