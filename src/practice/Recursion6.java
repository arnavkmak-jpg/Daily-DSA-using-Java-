package practice;

import java.util.Arrays;

public class Recursion6 {
    public static void main(String[] args){

        int[] arr = {5,4,3,2,1};

        Recursion6 recursion = new Recursion6();

        System.out.println(Arrays.toString(recursion.reverseArray(0, arr, arr.length)));


    }

    public int[] reverseArray(int i, int[] arr, int n){

        if(i>=n/2) return arr;

        int temp = arr[i];
        arr[i] = arr[(n-i)-1];
        arr[(n-i)-1] = temp;

        return reverseArray(i+1, arr, n);




    }




}
