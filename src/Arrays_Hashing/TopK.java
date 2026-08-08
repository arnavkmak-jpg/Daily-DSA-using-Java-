package Arrays_Hashing;


import java.util.*;

public class TopK {
    public static void main(String[] args) {
        int[] nums = {1,1,3,5,2,4,5,6,4,3,3,5,5,6,2,3,5,6,6,5,5};
        int k=2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int s:nums){
            if (!map.containsKey(s)){
                map.put(s,0);
            }
            else {
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> Integer.compare(b.getValue(), a.getValue()));

        int[] key = new int[k];
        for (int i=0; i<k; i++){
            key[i] = list.get(i).getKey();
        }



        System.out.println("k"+Arrays.toString(key));

    }
}
