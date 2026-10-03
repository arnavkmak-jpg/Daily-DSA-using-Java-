package practice.binary_search;

public class CountOccurrences {
    public static void main (String[] args){
        int[] nums = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;

        CountOccurrences obj = new CountOccurrences();

        System.out.println(obj.count(nums, target));


    }

    public int lowerBound(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int lb = nums.length;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] >= target){
                lb = mid;
                r = mid - 1;

            }
            else {
                l = mid + 1;
            }

        }
        return lb;



    }

    public int upperBound(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int ub = nums.length;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid] > target){
                ub = mid;
                r = mid - 1;

            }
            else {
                l = mid + 1;
            }

        }
        return ub;



    }
    public int count(int[] nums, int target){
        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);

        if (lb == nums.length || nums[lb]!=target) return 0;

        return ub - lb;

    }

}
