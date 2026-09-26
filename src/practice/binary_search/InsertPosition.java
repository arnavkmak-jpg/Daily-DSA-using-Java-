package practice.binary_search;

public class InsertPosition {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        InsertPosition obj = new InsertPosition();

        System.out.println(obj.insertPos(nums, target));


    }

    public int insertPos(int[] nums, int target){ // simply finding lower bound will return the answer
        int l = 0;
        int r = nums.length-1;
        int res = nums.length;

        while (l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>=target){
                res = mid;
                r = mid - 1;

            }
            else{
                l = mid + 1;
            }

        }
        return res;


    }
}
