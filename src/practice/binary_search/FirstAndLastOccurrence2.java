package practice.binary_search;

import java.util.Arrays;

public class FirstAndLastOccurrence2 {
    public static void main (String[] args){
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FirstAndLastOccurrence2 obj = new FirstAndLastOccurrence2();
        System.out.println(Arrays.toString(obj.firstAndLastOccurrence(nums, target)));

    }

    public int firstOccurrence(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int first = -1;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] == target){
                first = mid;
                r = mid - 1;

            }
            else if (nums[mid] < target){
                l = mid + 1;

            }
            else {
                r = mid - 1;
            }

        }
        return first;

    }

    public int lastOccurrence(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int last = -1;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] == target){
                last = mid;
                l = mid + 1;

            }
            else if (nums[mid] < target){
                l = mid + 1;

            }
            else {
                r = mid - 1;
            }

        }
        return last;

    }

    public int[] firstAndLastOccurrence(int[] nums, int target){
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);
        if (first == - 1) return new int[]{-1, -1};

        return new int[]{first,  last};

    }
}
