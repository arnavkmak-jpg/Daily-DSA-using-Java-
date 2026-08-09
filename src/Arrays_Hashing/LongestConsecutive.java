package Arrays_Hashing;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        HashSet<Integer> numSet = new HashSet<>();

        int result=0;

        for (int n: nums){
            numSet.add(n);
        }

        for (int num:numSet){
            if (!numSet.contains(num-1)){
                int curr=num;
                int count=0;
                while (numSet.contains(curr)){
                    curr++;
                    count++;
                }
                if(count>result){
                    result=count;
                }

            }


        }
        System.out.println(result);
    }
}
