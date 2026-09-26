package practice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int [] arr = {29,10,14,37,13};
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(arr);
    }

    public void selectionSort(int[] arr){ // method to apply selection sort
        for (int i = 0; i<arr.length-1; i++){ // outer loop used to iterate and set the boundary for each pass
            int minIdx = i; // we initially set the min index to be i
            for(int j = i; j<arr.length; j++){ // iterate through remaining array to find the new min
                if (arr[minIdx]>arr[j]){
                    minIdx = j;
                }
            }
            // swapping the i with new min
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }


}
