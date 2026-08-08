package Arrays_Hashing;

import java.util.Arrays;

public class exceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] products = new int[nums.length];
        int prefix =1;
        for (int i=0;i<nums.length;i++){
            products[i] = prefix;
            prefix*=nums[i];

        }
        int postfix =1;
        for (int i=nums.length-1;i>=0;i--){
            products[i] *= postfix;
            postfix*=nums[i];
        }
        System.out.println(Arrays.toString(products));
    }
}
