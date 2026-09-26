package practice.arrays;

public class NumberAppearance {
    public static void main(String[] args){
        int[] nums = {2,2,3,4,5,4,6,5,6};
        NumberAppearance obj = new NumberAppearance();
        System.out.println(obj.appearsOnce(nums));




    }

    public int appearsOnce(int[] nums){
        for (int i = 0;  i<nums.length; i++){
            int num = nums[i];
            int count = 0;
            for (int j = 0; j<nums.length; j++){
                if (nums[j]==num){
                    count++;

                }

            }
            if (count==1){
                return num;
            }


        }
        return -1;




    }

}
