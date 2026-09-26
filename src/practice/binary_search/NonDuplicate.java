package practice.binary_search;

public class NonDuplicate {
    public static void main (String[] args){
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        NonDuplicate obj = new NonDuplicate();

        System.out.println(obj.singleNonDuplicates(nums));


    }

    public int singleNonDuplicates(int[] nums){
        int l = 1; // we take extra index since we check elements to both left and right if they are equal
        int r = nums.length - 2;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums.length == 1) return nums[0]; // if only a single element exists it is the unique one
            // if mid has no equal neighbours then it will be the unique element
            if (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

            // normally the pairs follow even-odd order
            if (mid%2==1 && nums[mid]==nums[mid-1]){ // check if our index is odd and left to it is even hence the unique element will be on the right
                l = mid + 1;
            }
            // check if our index is even and right to it is a number equal to it hence it is in odd-even pair so the unique element is to the left which will be by default is above condition is not satisfied
            else {
                r = mid - 1;
            }

        }
        return -1;

    }

}
