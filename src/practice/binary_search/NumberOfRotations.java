package practice.binary_search;

public class NumberOfRotations {
    public static void main (String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        NumberOfRotations obj = new NumberOfRotations();

        System.out.println(obj.findRotations(nums));


    }

    public int findRotations(int[] nums){
        int l = 0;
        int r = nums.length - 1;
        int res = 0;
        while (l<=r){
            int mid  = l+(r-l)/2;

            if (nums[l]<=nums[r]) res = l;
            if (nums[mid] < nums[r]){
                r = mid;

            }
            else {
                l = mid + 1;
            }

        }
        return res;

    }

}
