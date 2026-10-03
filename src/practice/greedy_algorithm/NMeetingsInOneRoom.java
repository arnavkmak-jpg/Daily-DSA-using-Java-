package practice.greedy_algorithm;

import java.util.Arrays;

public class NMeetingsInOneRoom {
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start, end));


    }

    public static int maxMeetings(int[] start, int[] end){
        // we need a matrix that connects both start and end arrays
        int[][] startEnd = new int[start.length][2];

        for (int i = 0;  i<start.length; i++){
            startEnd[i][0] = start[i];
            startEnd[i][1] = end[i];
        }

        // sort the 1st column of the matrix in ascending order
        Arrays.sort(startEnd, (row1, row2) -> Integer.compare(row1[1], row2[1]));

        // make a hash array with -1 values at each place
        int maxEnd = startEnd[end.length-1][1]; // maximum possible ending time for meeting

        int[] meetings = new int[maxEnd + 1];
        Arrays.fill(meetings, -1);

        int lastIndex = 0;
        int completed = 0;
        // we now iterate through the matrix
        for (int i = 0; i < start.length; i++){
            int startIndex = startEnd[i][0];
            int endIndex = startEnd[i][1];
            if (startIndex > lastIndex){
                for (int j = startIndex; j<= endIndex; j++){
                    meetings[j] = 1;
                    lastIndex = j;
                }

                completed++;
            }

        }
        return completed;

    }


}
