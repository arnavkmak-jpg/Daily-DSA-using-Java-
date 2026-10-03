package practice.greedy_algorithm;

import java.util.Arrays;

public class JobSequencing {
    public static void main (String[] args){
        int[][] Jobs = {{1, 4, 20},{2, 1, 10},{3, 1, 40},{4, 1, 30}};
        System.out.println(Arrays.toString(jobScheduling(Jobs)));


    }

    public static int[] jobScheduling(int[][] Jobs){
        int maxDeadline = 0; // maximum possible deadline for any job
        for (int i = 0; i<Jobs.length; i++){ // iterate through column 1 to find the max deadline
            maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
        }
        int[] profits = new int[maxDeadline]; // array stores deadline days as indexes and profits as values
        Arrays.fill(profits, -1);
        Arrays.sort(Jobs, (row1, row2) -> Integer.compare(row2[2], row1[2]));
        int totalProfit = 0;
        int jobCount = 0;
        // our aim is to delay a job as much as possible while being greedy and going from most to least profit
        for (int i = 0; i<Jobs.length; i++){
            int deadline = Jobs[i][1]; // deadline of a given job

            for (int j = deadline - 1; j>=0; j--){
                if (profits[j] == -1){ // check if the index corresponding to deadline is available
                    totalProfit += Jobs[i][2]; // if it is we add the corresponding profit to total profit
                    jobCount++; // increase no. jobs completed
                    profits[j] = 1; // replace the -1 value in profit indicating it has been used
                    break;
                }

            }
        }
        return new int[]{jobCount, totalProfit};

    }
}
