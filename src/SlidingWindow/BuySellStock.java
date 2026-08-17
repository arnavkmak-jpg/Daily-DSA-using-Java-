package SlidingWindow;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        //prices = [7,1,5,3,6,4]

        int l = 0;
        int r = 1;
        int max = 0;

        while (r<prices.length){
            if (prices[l]>=prices[r]){
                l=r;
            }
            else {
                max = Math.max(max,prices[r]-prices[l]);
            }
            r++;

        }
        return max;



}
}
