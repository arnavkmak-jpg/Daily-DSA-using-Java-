package Binary_Search;

public class RotatedArray {
    public int findMin(int[] nums) {
        nums = new int[]{3,4,5,1,2};

        int l = 0;
        int r = nums.length-1;
        int min = nums[0];

        while (l<=r){
            int mid = l+(r-l)/2;
            min = Math.min(min,nums[mid]);
            if (nums[mid]>=nums[l]){
                l = mid+1;
            }
            else {
                r = mid-1;
            }


        }
        return min;
    }
}
