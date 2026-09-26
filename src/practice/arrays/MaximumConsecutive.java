package practice.arrays;

public class MaximumConsecutive {
    public static void main(String[] args){
        int[] nums = {1,1,0,0,1,1,1,0};
        MaximumConsecutive num = new MaximumConsecutive();
        System.out.println(num.findMaximumConsecutive(nums));

    }

    public int findMaximumConsecutive(int[] nums){
        int max = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }

        }
        return max;

    }
}
