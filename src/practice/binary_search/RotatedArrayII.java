package practice.binary_search;

public class RotatedArrayII {
    public static void main (String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int k = 3;
        RotatedArrayII obj = new RotatedArrayII();

        System.out.println(obj.isPresent(nums, k));



    }

    public boolean isPresent(int[] nums, int k){
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] == k) return true;
            // edge case in case mid element is equal to element at both left and right pointer
            if (nums[mid] == nums[l] && nums[mid] == nums[r]){
                l++;
                r--;
                continue;
            }
            // the same code for rotated array with unique elements ->

            if (nums[mid] > nums[l]){
                if (nums[l] <= k && k <= nums[mid]){
                    r = mid - 1;

                }
                else {
                    l = mid + 1;
                }
            }
            else {
                if (nums[mid] <= k && k <= nums[r]){
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }

        }
        return false;


    }
}
