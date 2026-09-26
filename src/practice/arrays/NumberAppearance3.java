package practice.arrays;

public class NumberAppearance3 {
    public static void main(String[] args){
        int[] nums = {2,2,3,4,5,4,6,5,6};
        NumberAppearance3 obj = new NumberAppearance3();
        System.out.println(obj.appearsOnce(nums));

    }

    public int appearsOnce(int[] nums){
        int XOR = 0;
        for (int num:nums){
            XOR ^= num;
        }
        return XOR;


    }

}
