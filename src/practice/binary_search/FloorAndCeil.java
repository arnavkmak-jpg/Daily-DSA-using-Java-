package practice.binary_search;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main (String[] args){
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 8;
        FloorAndCeil obj = new FloorAndCeil();
        System.out.println(Arrays.toString(obj.getFloorAndCeil(nums, x)));


    }
    // ceil >= target, smallest element which satisfies this which is present in the array
    // floor <= target,  largest element that satisfies this which is present in the array
    public int[]  getFloorAndCeil(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int[] store = {-1, -1}; // fill the array with -1 in case there exists no floor or ceil


        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] > target){ // if our mid element is greater than target we assume it as potential ceil
                store[1] = nums[mid];
                r = mid - 1; // we move right pointer to left of mid in case a smaller element exists that can be qualified as ceil

            }
            else if (nums[mid] < target){ // if our mid element is lesser than target we assume it as potential floor
                store[0] = nums[mid];
                l = mid + 1; // we move left pointer to right of mid in case a larger element exists that can be qualified as floor

            }
            else {
                store[0] = nums[mid]; // in case if an equal element is found to target our floor and ceil will be equal to that we can immediately return it
                store[1] = nums[mid];
                return store;

            }


        }
        return store;

    }

}
