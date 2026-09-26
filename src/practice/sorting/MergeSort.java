package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {29, 10, 14, 37, 13};

        MergeSort sort = new MergeSort();

        sort.mergeSort(arr, 0, arr.length);

    }

    public void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();; // a temporary array to store sorted elements

        int left = low; // pointer at 1st index of left subarray
        int right = mid+1; // pointer at 1st index of right subarray

        while(left<=mid && right<=high){ // loop runs till last indexes of the subarray
            if (arr[left] <= arr[right]){ // check if the left index is less than equal to the right one
                temp.add(arr[left]); // add in temp array and increment if true
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }

        }

        while(left<=mid){ // we check if there are still any remaining elements in the left array after loop finishes if so we add all of them to the temp array
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        // now we need to add the sorted elements back to original array from the temp array

        for(int i = low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }



    }

    public void mergeSort(int[] arr, int low, int high){
        // base case
        if(low>=high) return; // if the low index = high index it means we obtained arrays with index 1
        int mid = low+(high-low)/2; // find middle index to divide the array

        // recursive case
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high); // calling the merge method to merge the array back when done sorting

        System.out.println(Arrays.toString(arr));

    }
}
