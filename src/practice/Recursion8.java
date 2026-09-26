package practice;

public class Recursion8 {
    public static void main(String[] args){

        Recursion8  recursion = new Recursion8();

        System.out.println(recursion.fib(10));

    }

    public int fib(int n){

        if(n<=1) return n;

        return fib(n-1)+fib(n-2);


    }

}
