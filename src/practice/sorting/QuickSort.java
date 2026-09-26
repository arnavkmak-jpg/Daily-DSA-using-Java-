package practice.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args){
		int[] arr = {29, 10, 14, 37, 13};
		QuickSort sort = new QuickSort();

		sort.quickSort(arr, 0, arr.length-1);

	}

	public void quickSort(int[] arr, int low, int high){ // quick sort helper function
		//base case
		if(low>=high) return;

		int pivot = findPivot(arr, low, high);
		quickSort(arr, low, pivot-1);
		quickSort(arr, pivot+1, high);

		System.out.println(Arrays.toString(arr));


	}
	public int findPivot(int[] arr, int low, int high){ // method to find the pivot
		int pivot = arr[low]; // we choose our pivot as the 1st element
		int i = low; // set left pointer
		int j = high; // set right pointer

		while (i<j){ // loop runs till i and j cross each other
			while(arr[i]<=pivot && i<=high-1){ // run the loop till we find an element less than the pivot
				i++;
			}
			while(arr[j]>pivot && j>=low+1){
				j--;
			}
			if (i<j){ // swap element at i and j if i is to the left of high
				swap(arr,i,j);
			}
		}
		swap (arr,low, j); // finally put the pivot at it's sorted position with smaller elements to the left and larger elements to the right

		return j;

	}

	public void swap(int[] arr, int i, int j){ // helper method to swap elements
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}


}
