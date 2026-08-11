package Two_Pointers;

public class MostWater {
    class Solution {
        public int maxArea(int[] height) {


            height = new int[]{1,8,6,2,5,4,8,3,7};
            int result=0;
            int left=0;
            int right=height.length-1;

            while (left<right){
                int area = Math.min(height[left],height[right])*(right-left);
                result = Math.max(result,area);
                if (height[left]<height[right]){
                    left++;
                }
                else {
                    right--;
                }
            }
            return result;

        }
    }
}
