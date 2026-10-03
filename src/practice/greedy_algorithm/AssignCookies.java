package practice.greedy_algorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main (String[] args){
        int[] students = {4, 5, 1};
        int[] cookie = {6, 4, 2};
        System.out.println(findMaxCookies(students, cookie));

    }

    private static int findMaxCookies(int[] Student, int[] cookie){
        Arrays.sort(Student);
        Arrays.sort(cookie);
        int n1 = Student.length;
        int n2 = cookie.length;
        int s = 0;
        int c = 0;

        while(s < n1 && c < n2){
            if (cookie[c] >= Student[s]){
                s++;
                c++;
            }
            else{
                c++;
            }

        }
        return s;


    }
}
