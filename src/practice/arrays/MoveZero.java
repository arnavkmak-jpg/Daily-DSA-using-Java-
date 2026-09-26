package practice.arrays;

public class MoveZero {
    public static void main(String[] args){
        int[] nums = {0, 1, 4, 0, 5, 2};
        MoveZero zero =  new MoveZero();
        zero.moveZeroes(nums);
        for (int num:nums){
            System.out.print(num+" ");
        }
    }

    public void moveZeroes(int[] nums){
        int l = 0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]!=0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;

            }

        }

    }
}
