package practice.arrays;

public class SecondLargestOptimised {
    public static void main(String[] args){
        int[] nums = {7, 7, 2, 2, 10, 10, 10};
        SecondLargestOptimised slo = new SecondLargestOptimised();
        System.out.println(slo.secondLargest(nums));

    }

    public int secondLargest (int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }

        }

        return secondLargest;
    }

}
