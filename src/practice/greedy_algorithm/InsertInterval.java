package practice.greedy_algorithm;

import java.util.Arrays;

public class InsertInterval {
    public static void main(String[] args){
        int[][] intervals = {{1, 2},{3, 5},{6, 7},{8, 10}};
        int[] newInterval = {4, 8};
        System.out.println(Arrays.deepToString(insertNewInterval(intervals, newInterval)));

    }


    public static int[][] insertNewInterval(int[][] intervals, int[] newInterval){

        int[][] inserted = new int[intervals.length][2];
        // pointer to traverse through the inserted array
        int count = 0;
        for (int i = 0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            // CASE I both start and end don't lie between new intervals
            if (start > newInterval[1]) {
                inserted[count] = newInterval;
                count++;
                inserted[count] = intervals[i]; // put the row directly in the new array
                count++;
            }
            else if (end < newInterval[0]){
                inserted[count] = intervals[i]; // put the row directly in the new array
                count++;
            }
            else {
                // if only the start is between new interval
                if (newInterval[0] <= start && start <= newInterval[1] && newInterval[1] < end){
                    newInterval[1] = end;

                }
                // if only end is between the new interval
                else if (newInterval[0] <= end && end <= newInterval[1] && start < newInterval[0]){
                    newInterval[0] = start;
                }
                // if the new interval is between the start and end
                else if (newInterval[0] >= start && newInterval[1] <= end){
                    newInterval = intervals[i];
                }

            }


        }
        if (newInterval[0] > inserted[count-1][1]){
            inserted[count] = newInterval;
        }
        return inserted;



    }
}
