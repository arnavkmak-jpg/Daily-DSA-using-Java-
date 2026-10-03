package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 3, 4};
        int[] nums2 = {2, 3, 5, 6};

        Union u = new Union();


        System.out.println(Arrays.toString(u.unionArrays(nums1, nums2)));


    }

    public int[] unionArrays(int[] nums1, int[] nums2) {
        int l1 = 0;
        int l2 = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (l1 < nums1.length && l2 < nums2.length) {
            int currValue;
            if (nums1[l1] < nums2[l2]) {
                currValue = nums1[l1];
                l1++;

            } else if (nums2[l2] < nums1[l1]) {
                currValue = nums2[l2];
                l2++;
            } else {
                currValue = nums1[l1];
                l1++;
                l2++;
            }

            if (union.isEmpty() || union.get(union.size() - 1) != currValue) {
                union.add(currValue);

            }


        }

        while (l1 < nums1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums1[l1]) {
                union.add(nums1[l1]);
            }
            l1++;

        }

        while (l2 < nums2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums2[l2]) {
                union.add(nums2[l2]);
            }
            l2++;

        }

        int[] nums = new int[union.size()];
        for (int i = 0; i < union.size(); i++) {
            nums[i] = union.get(i);
        }

        return nums;

    }
}