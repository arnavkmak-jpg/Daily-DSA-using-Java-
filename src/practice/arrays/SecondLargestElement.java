package practice.arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] nums = {2, 5, 1, 9, 3};
        SecondLargestElement n = new SecondLargestElement();
        System.out.println(n.secondLargestElement(nums));
    }

        public int secondLargestElement(int[] nums){
            int max = nums[0];
            for (int i = 1;  i<nums.length; i++){

                max = Math.max(max, nums[i]);

            }
            int secondMax = -1;
            for (int j = 0; j<nums.length; j++){
                if(nums[j]>secondMax && nums[j]<max){
                    secondMax = nums[j];
                }
            }

            return secondMax;


        }
}
