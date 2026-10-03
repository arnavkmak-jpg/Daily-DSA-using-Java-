package practice.binary_search;

public class MinimumInArray {
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, -7, 1, 2, 3};
        MinimumInArray obj = new MinimumInArray();

        System.out.println(obj.findMin(nums));

    }

    public int findMin(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = l + (r-l)/2;

            // this means the array obtained is sorted hence min element is at the beginning
            if (nums[l]<=nums[r]) return nums[l];

            // this means the number is within right part
            if (nums[mid] >= nums[l]){
                l = mid + 1;

            }
            // this means number is within left part
            else {
                r = mid; // we include mid since mid can also be minimum
            }

        }
        return 0;

    }

}
