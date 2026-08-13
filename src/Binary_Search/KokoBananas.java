package Binary_Search;

import java.util.Arrays;

public class KokoBananas {
    public int minEatingSpeed(int[] piles, int h) {
        piles = new int[]{3,6,7,11};
        h = 8;
        int max = piles[0];
        int result=0;

        for (int p:piles){
            if (piles[p]>max){
                max = piles[p];
            }
        }

        int l = 1;
        int r = max;

        while (l<=r){
            int k = l+(r-l)/2;
            long time=0;
            for (int p:piles){
                time += (p+k-1)/k;
            }
            if (time<=h){
                result=k;
                r=k-1;
            }
            else {
                l=k+1;

            }
        }
        return result;

    }
}
