package Arrays_Hashing;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length/2;
        for (int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if (map.get(n)>len){
                return n;
            }
        }

        return 0;


    }
}
