package practice;

public class Recursion7 {
    public static void main(String[] args){

        String s = "Hannah".toLowerCase();

        Recursion7  recursion = new Recursion7();

        System.out.println(recursion.isPalindrome(0,s,s.length()));



    }

    public boolean isPalindrome(int i, String s, int n){
        if(n==0) return true;
        if(i>=n/2) return true;


        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }

        return isPalindrome(i+1, s, n);


    }
}
