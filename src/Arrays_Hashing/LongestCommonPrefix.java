package Arrays_Hashing;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        for (int i =0; i< strs[0].length(); i++){ // pick the 1st element of the strs array
            for (String s:strs){ // iterating through entire array
                if (i==s.length()|| s.charAt(i)!=strs[0].charAt(i)){
                    return s.substring(0,i);
                }

            }

        }
        return strs[0];

    }
}
