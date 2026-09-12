package Arrays_Hashing;

import java.util.ArrayList;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0, nums.length-1);
        return nums;

    }

    private void mergeSort(int[] arr, int left, int right){
        if (left>=right){
            return;
        }

        int mid = left+(right-left)/2;
        mergeSort(arr,left,mid); // split into left and right parts
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);

    }

    private void merge(int[] arr, int left, int mid, int right){
        ArrayList<Integer> list = new ArrayList<>();
        int i = left; // iterate through left array
        int j = mid+1; // iterate through right array

        while (i<=mid && j<=right){
            if (arr[i]<=arr[j]){ // check if element in left array is less than equal to one in right
                list.add(arr[i]);
                i++;
            }
            else {
                list.add(arr[j]);
                j++;
            }
        }
        while (i<=mid){ // if the elements are still left in left array after loop execution add them to the array
            list.add(arr[i]);
            i++;
        }
        while (j<=right){
            list.add(arr[j]);
            j++;
        }

        // copy the elements from temp array to original array
        for (i=left; i<=right; i++){ // iterate through original array
            arr[i] = list.get(i-left); // here i-left returns an index corresponding to the index of original array for ex og array is a right array with index 3,4,5, l=3 i-left=3-3=0

        }
    }
}
