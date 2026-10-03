package practice.greedy_algorithm;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args){
        int[][] intervals = {{-5000, 1}};
        System.out.println(MaximumNonOverlappingIntervals(intervals));


    }

    public static int MaximumNonOverlappingIntervals(int[][] intervals){
        // sort the matrix by the end time of the interval
        Arrays.sort(intervals, (row1, row2) -> Integer.compare(row1[1], row2[1]));

        // maximum possible interval will be the last value of end column since it's sorted smaller to larger
        int maxInterval = intervals[intervals.length - 1][1];


        int completed = 0; // to track the no. intervals completed
        int lastIndex = Integer.MIN_VALUE; // to track the last index of last interval finished

        // iterating through the matrix rows
        for (int i = 0; i<intervals.length; i++){
            if (intervals[i][0] >= lastIndex){
                completed++;
            }
            lastIndex = intervals[i][1];

        }
        return intervals.length - completed;

    }

}
