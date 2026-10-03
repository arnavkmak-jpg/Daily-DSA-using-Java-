package practice.greedy_algorithm;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args){
        int [][] intervals = {{1,4},{5,6}};
        System.out.println(Arrays.deepToString(merge(intervals)));


    }

    public static int[][] merge(int[][] intervals){
        // the list to store the new merged values
        List<int[]> merged = new ArrayList<>();

        // sort the given matrix
        Arrays.sort(intervals, (row1, row2) -> Integer.compare(row1[0], row2[0]));

        // take the 1st element as the reference to compare initially
        int[] ref = intervals[0];

        if (intervals.length <= 1) return intervals;
        for (int i = 1; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            // the start will always be greater than or equal to the 0th ref since it is sorted array so we have to check if it is also less than the 1st ref then it is within the bounds of the ref
            if (start <= ref[1]){
                ref[0] = Math.min(ref[0], start);
                ref[1] = Math.max(ref[1], end);
            }
            else {
                // if the start of current element is greater than end of ref we can have no more merges so we add ref to the new list
                merged.add(ref);
                ref = intervals[i]; // and add our new element as ref to check for merges ahead;
            }
        }
        merged.add(ref);

        return merged.toArray(new int[merged.size()][]);



    }
}
