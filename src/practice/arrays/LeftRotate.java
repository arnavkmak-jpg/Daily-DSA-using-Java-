package practice.arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        LeftRotate num = new LeftRotate();
        num.leftRotate(nums);

    }

    public void leftRotate(int[] arr){
        int first = arr[0];
        int n = arr.length;
        for (int i = 0; i<n-1; i++){

            arr[i] = arr[i+1];

        }

        arr[n-1] = first;

        System.out.println(Arrays.toString(arr));

    }
}
