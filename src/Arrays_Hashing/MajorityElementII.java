package Arrays_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
         //nums = [3,2,3]
        ArrayList<Integer> list =  new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if (map.get(nums[i])> nums.length/3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }

        }

        return list;



    }
}
