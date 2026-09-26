package practice.arrays;

import java.util.HashMap;

public class NumberAppearance2 {
    public static void main(String[] args){
        int[] nums = {2,2,3,4,5,4,6,5,6};
        NumberAppearance2 obj = new NumberAppearance2();
        System.out.println(obj.appearsOnce(nums));



    }

    public int appearsOnce(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);


        }
        for(int key:map.keySet()){ // iterate through the keys in the map and if the value of any key is 1 we found our required element
            if(map.get(key)==1){
                return key;
            }

        }

        return -1;

    }
}
