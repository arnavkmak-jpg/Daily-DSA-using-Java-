package practice;

public class Recursion {

    public static void main(String[] args){
        printName("name", 5);
    }

    public static void printName(String name, int n){

        if(n<=0) return;

        System.out.println(name);

        printName(name, n-1);

    }

}
