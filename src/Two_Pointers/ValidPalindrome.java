package Two_Pointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
         s = "A man, a plan, a canal: Panama";

         char[] letters = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();

         int left =0;
         int right= letters.length-1;
         while (left<right){
             if (letters[left]!=letters[right]){
                 return false;
             }
             left++;
             right--;
         }

        return true;



    }

}
