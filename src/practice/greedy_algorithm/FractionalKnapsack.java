package practice.greedy_algorithm;

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args){
        int[] values = {60,100};
        int[] weights = {10,20};
        long cap = 50;

        System.out.println(fractionalKnapsack(values, weights, cap));



    }

    private static double fractionalKnapsack(int[] val, int[] wt, long cap){
        int n = val.length;
        // items object array to put in all Items object with their value and weight
        Items[] items = new Items[n];

        for (int i = 0; i<n; i++){ // loop through both given arrays and put them in
            items[i] = new Items(val[i], wt[i]);

        }
        // reverse sort the ratios of val and weight as one with higher ratio will provide more value per weight
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.ratio, item1.ratio));

        double maxVal = 0.0;

        for (Items item: items){
            if (cap == 0) break;

            if (item.weight <= cap){ // if the weight of item is less than or equal to cap we can put it in
                maxVal += item.value;
                cap -= item.weight;

            }

            else { // if it is not we put the ratio*cap since ratio tells us how much value 1 weight will give so accordingly we get value for remaining weight for the following item
                maxVal += item.ratio*cap;
                cap = 0;
            }

        }
        return maxVal;

    }




}

class Items{
    int value;
    int weight;
    double ratio;

    Items (int value, int weight){
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value/weight;
    }


}
