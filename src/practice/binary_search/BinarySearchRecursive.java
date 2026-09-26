package practice.binary_search;

public class BinarySearchRecursive {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        BinarySearchRecursive obj = new BinarySearchRecursive();

        System.out.println(obj.search(nums, target));

    }

    public int binarySearch(int[] nums, int low, int high, int target){

        if(low>high) return -1; // if the pointers cross each other element does not exist

        int mid = low+(high-low)/2;

        if (target == nums[mid]){
            return mid;
        }

        else if (target > nums[mid]){
            return binarySearch(nums, mid+1, high,target);

        }


        return binarySearch(nums, low, mid-1, target);



    }

    public int search(int[] nums, int target){
        return binarySearch(nums, 0, nums.length-1, target);

    }
}
