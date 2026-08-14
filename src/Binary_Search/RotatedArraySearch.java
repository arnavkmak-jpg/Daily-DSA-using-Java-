package Binary_Search;

public class RotatedArraySearch {
    public int search(int[] nums, int target) {
        //nums = [4,5,6,7,0,1,2], target = 0
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int mid = l+(r-l)/2;
            if (nums[mid]>nums[r]){
                l=mid+1;
            }
            else {
                r=mid;

            }
        }
        int pivot = l;
        int l1;
        int r1;
        int mid = l+(r-l)/2;

        if (target<=nums[nums.length-1]){
            l1 = pivot;
            r1 = nums.length-1;
        }
        else {
            l1 = 0;
            r1 = mid-1;
        }
        while (l1<=r1){
            int mid1 = l1+(r1-l1)/2;
            if (nums[mid1]<target){
                l1 = mid1+1;

            }
            else if(nums[mid1]>target){
                r1 = mid1-1;
            }
            else {
                return mid1;
            }
        }
        return -1;




    }
}
