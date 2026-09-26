package practice.arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {0, 2, 3, 1, 4};
        MissingNumber obj = new MissingNumber();


        System.out.println(obj.missingNumber(nums));


    }

    public int missingNumber(int[] nums){
        int XOR1 = 0;
        int XOR2 = 0;
        int n  = nums.length;
        for (int i = 0; i<n; i++){
            XOR1 ^= nums[i];

        }
        for (int i = 0; i<=n; i++){
            XOR2 ^= i;

        }

        return XOR1^XOR2;


    }
}
