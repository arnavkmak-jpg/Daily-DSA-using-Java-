package Dynamic_Programming;

public class HouseRobber {
    public int rob(int[] nums) {

        // in this problem we take two pointers rob1 and rob2
        // rob1 is 2 index preceding n and rob2 1 index preceding n
        // we add rob1+n since we can only rob adjacent houses and compare them to rob2 which stores the max value
        // if rob1+n exceeds rob2 that means it's the new max

        int rob1 = 0;
        int rob2 = 0;

        // [rob1,rob2,n,n+1...]
        for (int n:nums){
            int temp = Math.max(n+rob1, rob2);
            rob1 = rob2;
            rob2 = temp;

        }

        return rob2;

    }
}
