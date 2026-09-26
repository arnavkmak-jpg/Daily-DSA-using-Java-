package practice;

public class Recursion2 {
    public static void main(String[] args){
        Recursion2 recursion = new Recursion2();

        recursion.printNum(5);
    }

    public void printNum(int n){

        if(n==0) return;

        printNum(n-1);

        System.out.println(n+" ");


    }

}
