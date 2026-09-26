package practice;

public class Recursion5 {
    public static void main(String[] args){
        Recursion5 recursion = new Recursion5();

        System.out.println(recursion.factorial(5));
    }

    public int factorial(int n){

        if(n<=1) return 1;

        return n*factorial(n-1);
    }
}
