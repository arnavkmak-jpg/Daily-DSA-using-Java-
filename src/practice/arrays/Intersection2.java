package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 3, 3, 4, 5, 7};

        Intersection2 obj = new Intersection2();

        System.out.println(obj.intersectArray(nums1, nums2));


    }

    public List<Integer> intersectArray(int[] nums1, int[] nums2){
        int left = 0;
        int right = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> intersect = new ArrayList<>();

        while(left<n1 && right<n2){

            if(nums1[left]<nums2[right]){
                left++;

            }
            else if(nums1[left]>nums2[right]){
                right++;
            }
            else{
                intersect.add(nums1[left]);
                left++;
                right++;
            }

        }
        return intersect;


    }
}
