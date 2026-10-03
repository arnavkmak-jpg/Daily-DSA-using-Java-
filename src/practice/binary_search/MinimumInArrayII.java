package practice.binary_search;

public class MinimumInArrayII {
    public static void main(String[] args){
        int[] nums = {2, 2, 1, 2};
        MinimumInArrayII obj = new MinimumInArrayII();
        System.out.println(obj.findMin(nums));

    }

    public int findMin(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = l+(r-l)/2;

            if (nums[mid] < nums[r]){
                r = mid;
            }
            else if (nums[mid] > nums[r]){
                l = mid + 1;

            }
            else {
                r--;
            }


        }
        return nums[l];


    }

}
