package practice.greedy_algorithm;

import java.util.Arrays;

public class ShortestJobFirst {
    public static void main (String[] args){
        int[] bt = {4, 1, 3, 7, 2};
        System.out.println(solve(bt));


    }

    public static long solve(int[] bt){
        Arrays.sort(bt);
        int btSum = 0; // for storing sum of all bts
        int totalWaitingTime = 0; // for storing waiting time for each value since it sum of execution times of all previous elements at each element
        int n = bt.length;

        for (int i = 0; i<n-1; i++){
            btSum += bt[i];

            totalWaitingTime += btSum;

        }

        return totalWaitingTime/n;

    }
}
