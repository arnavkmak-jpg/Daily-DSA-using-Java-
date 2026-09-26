package practice.binary_search;

public class LowerBound {
    public static void main(String[] args){
        int[] nums = {3,5,8,15,19};
        int target = 9;
        LowerBound obj = new LowerBound();
        System.out.println(obj.lowerBound(nums, target));

    }

    public int lowerBound(int[] nums, int target){

        int l = 0;
        int r = nums.length-1;
        int res = nums.length;
        while(l<=r){
            int mid = l+(r-l)/2;
            if (target > nums[mid]){
                l = mid+1;
            }
            else {
                res = mid;
                r = mid-1;

            }


        }


        return res;
    }

}
