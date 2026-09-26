package practice.binary_search;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main (String[] args){
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FirstAndLastOccurrence obj = new FirstAndLastOccurrence();
        System.out.println(Arrays.toString(obj.firstAndLastOccurrence(nums, target)));


    }

    public int lowerBound (int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int res = nums.length;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] >= target){
                res = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }


        }
        return res;


    }

    public int upperBound (int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int res = nums.length;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] > target){
                res = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }

        }
        return res;

    }

    public int[] firstAndLastOccurrence(int[] nums, int target){

        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target) - 1;
        if (lb==nums.length || nums[lb]!=target) return new int[]{-1,-1};

        return new int[]{lb, ub};


    }


}
