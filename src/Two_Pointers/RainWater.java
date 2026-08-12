package Two_Pointers;

public class RainWater {
    public int trap(int[] height) {
        height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        int l=0;
        int r= height.length-1;
        int lmax=height[l];
        int rmax=height[r];
        int result=0;

        while (l<r){
            if (height[l]<height[r]){
                l++;
                lmax = Math.max(lmax,height[l]);
                result += lmax-height[l];


            }
            else{
                r--;
                rmax = Math.max(rmax,height[r]);
                result += rmax-height[r];
            }
        }

        return result;

    }

}
