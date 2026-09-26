package practice.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {29, 10, 14, 37, 13};
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
    }


    public void bubbleSort(int[] arr){ // method for bubble sorting
        int n = arr.length;
        for(int i=0; i<n-1; i++){// outer loop iterates through entire array missing the last element since bubble sort guarantees last element to be already sorted after one pass
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){ // the inner loop iterates through the remaining array that is bound by last element and the initial element since we compare to index j+1
                if(arr[j]>arr[j+1]){ // if the next element is found to be greater than previous we peform swapping
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
        System.out.println(Arrays.toString(arr)); // finally print the sorted array

    }
}
