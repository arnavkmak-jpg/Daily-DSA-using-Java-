package practice.arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] nums = {2,5,1,9,3};
        LargestElement element = new LargestElement();
        System.out.println(element.largestElement(nums));
    }
    public int largestElement(int[] nums){
        int max = nums[0];
        for (int i = 1; i<nums.length; i++){
            max = Math.max(max, nums[i]);

        }

        return max;

    }
}
