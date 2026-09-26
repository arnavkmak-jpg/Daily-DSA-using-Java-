package practice.binary_search;

public class UpperBound {
    public static void main(String[] args){
        int[] nums = {3,5,8,9,15,19};
        int target = 9;
        UpperBound obj = new UpperBound();
        System.out.println(obj.upperBound(nums, target));


    }

    public int upperBound (int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int res = nums.length;
        while (l<=r){

            int mid = l+(r-l)/2;
            if (nums[mid]>target){
                res = mid;
                r = mid-1;


            }
            else{
                l = mid+1;
            }


        }
        return res;




    }
}
