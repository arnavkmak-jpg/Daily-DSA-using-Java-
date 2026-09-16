package Arrays_Hashing;

public class BuySellStockII {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int profit = 0;

        while(r<prices.length){
            if (prices[l]<prices[r]){
                profit += prices[r]-prices[l];
            }
            l=r;
            r++;
        }

        return profit;

    }

}
