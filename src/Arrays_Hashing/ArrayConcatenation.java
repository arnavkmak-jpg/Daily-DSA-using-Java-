package Arrays_Hashing;

public class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] newNum = new int[2*nums.length];

        for (int i = 0; i<nums.length; i++){
            newNum[i] = nums [i];
            newNum[i+nums.length] = nums[i];
        }

        return newNum;

    }
}
