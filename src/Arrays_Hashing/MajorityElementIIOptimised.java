package Arrays_Hashing;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementIIOptimised {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        // find the 2 majority candidate using Boyer Moore's
        for (int num:nums){
            if (num==candidate1){ // check if the current num is equals candidate1 value if yes we increase count1
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
            else if(count1==0){ // check if count1 is 0 which is either initially or an element exists with more occurrences
                candidate1 = num;
                count1 = 1;
            }
            else if(count2==0){
                candidate2 = num;
                count2 = 1;
            }
            else{ // if no element matching the candidates is found we reduce the counts
                count1--;
                count2--;
            }
        }

        // verification
        count1 = 0; // we reset our counts
        count2 = 0;
        for (int num:nums){
            if (num==candidate1) { // we check if our current num is equal to our chosen candidates if yes we increase the counts
                count1++;
            }
            else if (num==candidate2) {
                count2++;
            }
        }
        // now if our candidates are valid the counts we obtain will be greater than n/3 so we check
        ArrayList<Integer> list =  new ArrayList<>();
        if (count1> nums.length/3){
            list.add(candidate1); // we add our candidate1 if the corresponding count is greater than the n/3
        }
        if (count2> nums.length/3){
            list.add(candidate2);
        }
        return list;

    }
}
