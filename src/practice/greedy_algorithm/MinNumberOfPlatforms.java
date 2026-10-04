package practice.greedy_algorithm;

import java.util.Arrays;

public class MinNumberOfPlatforms {
    public static void main (String[] args){
        int[] arrival = {900, 1100, 1235};
        int[] departure = {1000, 1200, 1240};

        System.out.println(findPlatform(arrival, departure));

    }


    private static int findPlatform(int[] Arrival, int[] Departure){
        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int arv = 0; // pointer to iterate through arrival times
        int dpt = 0; // pointer to iterate through departure times
        int platforms = 0; // count number of platform at each iteration
        int max = 0; // get the maximum platform number at any moment

        while (arv < Arrival.length){
            if (Arrival[arv] <= Departure[dpt]){ // if a train arrives sooner we add 1 platform and move to next arrival
                platforms++;
                arv++;
            }
            else { // otherwise a train departs earlier so we remove no. of platforms currently required and move ro next departure
                platforms--;
                dpt++;
            }

            max = Math.max(platforms, max);

        }

        return max;



    }
}
