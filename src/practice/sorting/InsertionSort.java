package practice.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {29,10,14,37,13};
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(arr);

    }

    public void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i<n; i++){ // initiate i at 1 since 1st element is assumed to be sorted in 1st iteration
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
