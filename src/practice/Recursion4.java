package practice;

public class Recursion4 {
    public static void main(String[] args){

        Recursion4 recursion = new Recursion4();

        System.out.println(recursion.sumNum(5));


    }

    public int sumNum(int n){
        if(n==1) return 1;

        return n+sumNum(n-1);
    }
}
