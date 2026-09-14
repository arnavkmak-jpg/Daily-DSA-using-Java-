package Arrays_Hashing;

import java.util.HashMap;

public class subArraySumK {
    public int subarraySum(int[] nums, int k) {

        // nums = [1,1,1], k = 2
        int currSum = 0; // sums all the elements one by one
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // for case where the entire selected subarray has sum of zero

        for (int num:nums){
            currSum += num;
            int diff = currSum-k;
            result += map.getOrDefault(diff,0); // check if the diff element exists in the hashmap if it does we add it's corresponding value which tells us how many subarray exists with sum of that value that we can remove from diff to get 0
            map.put(currSum,map.getOrDefault(currSum,0)+1); // put the subrray sum in the hashmap if it does not exist increase it's count by 1 if it does exist

        }

        return result;



    }
}
