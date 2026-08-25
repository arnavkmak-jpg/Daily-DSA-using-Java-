package LInkedList;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow1 = 0; //Floyd warshall method here
        int fast = 0;

        do {
            slow1 = nums[slow1]; //increment by 1
            fast = nums[nums[fast]]; //increment by 2
        } while (slow1!=fast); // till they meet

        int slow2 =0; // another slow pointer at very start
        while (slow1!=slow2){ // they will meet at the duplicate element
            slow1 = nums[slow1];
            slow2 = nums[slow2];
        }
        return slow1; //return the duplicate
    }
}
