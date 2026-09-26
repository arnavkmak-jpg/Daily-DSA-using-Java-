package practice.binary_search;

public class BinarySearchIterative {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        BinarySearchIterative obj = new BinarySearchIterative();

        System.out.println(obj.binarySearch(nums, target));


    }

    public int binarySearch(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;

        while (l<=r){
            int mid = l+(r-l)/2;

            if (target == nums[mid]){
                return mid;
            }
            else if (target < nums[mid]){
                r = mid - 1;

            }
            else {
                l = mid + 1;
            }


        }
        return -1;

    }

}
