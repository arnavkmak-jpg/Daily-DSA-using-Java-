package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 3, 3, 4, 5, 7};

        Intersection obj = new Intersection();

        System.out.println(obj.intersectArray(nums1, nums2));



    }

    public List<Integer> intersectArray(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> intersect =  new ArrayList<>();
        int[] visited = new int[n2]; // we make a visited array fill it will zeroes in order to track the index of the element in the 2nd array that has been used already
        Arrays.fill(visited, 0);
        for(int i = 0; i<nums1.length; i++){ // loop to iterate through nums1 array
            for(int j = 0; j<nums2.length; j++){ // loop to iterate through nums2 and compare if elements matches to nums1
                if(nums1[i] == nums2[j] && visited[j]==0){ // add to the list of elements are equal and the visited list indicates element hasn't been used
                    intersect.add(nums2[j]);
                    visited[j] = 1;
                }

            }

        }
        return intersect;


    }

}
