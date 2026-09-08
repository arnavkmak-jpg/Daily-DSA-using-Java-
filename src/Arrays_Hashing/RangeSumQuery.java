package Arrays_Hashing;

public class RangeSumQuery {
    int[] prefix;
    public RangeSumQuery(int[] nums) {

        prefix = new int[nums.length];
        int pre = 0;
        for (int i = 0; i<nums.length; i++){ // iterate through each element of nums array add them to pre every iteration and put them in a new array prefix
            pre += nums[i];
            prefix[i] = pre; // [-2, 0, 3, -5, 2, -1] to [-2, -2, 1, -4, -2, -3]
        }

    }

    public int sumRange(int left, int right) {
        int r = prefix[right];
        int l = left>0? prefix[left-1]:0; // check if the left pointer is greater than 0 if it is we subtract the sum of the elements before the left pointer from the right

        return r-l;
    }



}
