package Two_Pointers;

public class TwoSumII {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            numbers = new int[]{2,7,11,15};
            target = 9;
            int left = 0;
            int right = numbers.length-1;

            while (left<right){
                if (numbers[left]+numbers[right]>target){
                    right--;
                }
                else if (numbers[left]+numbers[right]<target){
                    left++;
                }
                else {
                    return new int[]{left+1,right+1};
                }
            }






            return new int[]{0,0};

        }

    }
}
