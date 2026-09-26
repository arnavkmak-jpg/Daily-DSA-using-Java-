package practice.binary_search;

public class RotatedArray {
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        RotatedArray obj = new RotatedArray();
        System.out.println(obj.search(nums, k));

    }

    public int search(int[] nums, int k){
        int l = 0;
        int r = nums.length;

        while (l <= r){
            int mid = l+(r-l)/2;
            if (nums[mid] == k){
                return mid;
            }
            // check if left array is sorted
            if (nums[mid] >= nums[l]){
                if (nums[l]<=k && k<=nums[mid]){ // check of the target lies within the sorted array
                    r = mid - 1; // if it does we look for it to the left

                }
                else {
                    l = mid + 1; // if it does not we look for it to the right
                }

            }
            //  if our left array is not sorted then right array will be guaranteed to be sorted
            else {
                if (nums[mid] <= k && k <= nums[r]){ // check if array lies in right sorted array

                    l = mid + 1;
                }
                else {
                    r = mid - 1; // if it does not lie within sorted right array it must be in left
                }

            }


        }
        return -1;


    }

}
