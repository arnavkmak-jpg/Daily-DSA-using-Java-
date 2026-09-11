package Arrays_Hashing;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // k pointer is used to track the given value in the array
        for(int i =0; i<nums.length; i++){ // i pointer is used to iterate through the entire array
            if (nums[i]!=val){  // if we find the given value in array we skip it and k stays at the same place
                nums[k] = nums[i];
                k++;
            }
        }

        return k; // at the end k displays the amount of non values

    }
}
