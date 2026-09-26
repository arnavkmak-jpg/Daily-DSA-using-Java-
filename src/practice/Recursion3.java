package practice;

public class Recursion3 {
    public static void main(String[] args){

        Recursion3  recursion = new Recursion3();

        recursion.printNum(5);

    }

    public void printNum(int n){
        if(n==0) return;

        System.out.println(n);

        printNum(n-1);
    }
}

