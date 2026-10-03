package practice.greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval2 {
    public static void main (String[] args){
        int[][] intervals = {{1, 2},{3, 5},{6, 7},{8, 10}};
        int[] newInterval = {4, 8};
        System.out.println(Arrays.deepToString(insertInterval(intervals, newInterval)));


    }

    public static int[][] insertInterval(int[][] intervals, int[] newInterval){
        // new list to store the values
        List<int[]> inserted = new ArrayList<>();

        int i = 0; // pointer to traverse through the intervals array
        int n = intervals.length;
        // start = intervals[i][0];
        // end = intervals[i][1];

        // for the left array where the end is always less than 0th index of newInterval since array is sorted and non overlapping we don't need to check for start

        while (i < n && intervals[i][1] < newInterval[0]){
            inserted.add(intervals[i]);
            i++;
        }
        // all index after this end > newInterval[0]

        // for the middle array where we merge the arrays with newInterval if they overlap that is if the start lies before the 1st index of newInterval since after previous while loop end will lie after 0th index so we don't need to check for it

        while (i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        inserted.add(newInterval);

        // add the remaining elements that don't overlap with newInterval since their start is larger than 1st element of newInterval

        while(i < n && intervals[i][0] > newInterval[1]){
            inserted.add(intervals[i]);
            i++;
        }

        return inserted.toArray(new int[inserted.size()][]);
    }


}
