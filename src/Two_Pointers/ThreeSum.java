package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {

            HashMap<Integer,Integer> map = new HashMap<>();

            List<List<Integer>> list = new ArrayList<>();

            nums = new int[]{-1,0,1,2,-1,-4};

            Arrays.sort(nums);

            for (int i=0;i<nums.length;i++){
                if (nums[i]>0&&nums[i]==nums[i-1]){
                    continue;
                }
                int left = i+1;
                int right = nums.length-1;
                while (left<right){
                    if (nums[left]+nums[right]+nums[i]<0){
                        left++;

                    }
                    else if (nums[left]+nums[right]+nums[i]>0) {
                        right--;

                    }
                    else {
                         list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                         left++;
                         right--;
                         while (left<right&&nums[left]==nums[left-1]){
                             left++;
                         }
                         while (left<right&&nums[right]==nums[right+1]){
                             right--;
                         }


                    }

                }
            }
            return list;
    }
}
