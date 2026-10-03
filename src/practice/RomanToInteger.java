package practice;

import java.util.HashMap;

public class RomanToInteger {
    public static void main (String[] args){
        String s = "XLII";

        RomanToInteger obj = new RomanToInteger();

        System.out.println(obj.romanToInteger(s));

    }

    public int romanToInteger(String s){
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int num = 0;

        for (int i=0; i<s.length(); i++){
            if (i+1<s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                num -= romanMap.get(s.charAt(i));

            }
            else {
                num += romanMap.get(s.charAt(i));
            }

        }
        return num;



    }

}
