package practice.greedy_algorithm;

import java.util.Arrays;

public class LemonadeChange {
    public static void main (String[] args){
        int[] bills = {5, 5, 10, 10, 20};

        System.out.println(lemonadeChange(bills));


    }


    private static boolean lemonadeChange (int[] bills){
        int fives = 0; // for no. of 5 changes
        int tens = 0; // for no. of 10 changes
        // no  twenties needed since it cannot be used as a change
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5){ // if customer pays with 5$ bill
                fives++;

            }
            else if (bills[i] == 10){ // if customer pays with 10$ bill we get a 10$ bill and give a 5$ bill
                tens++;
                fives--;
            }
            else { // if cutomer pays with $20 bill we need to return 15$
                if (tens>0){ // we can do that with either 1 $10 + 1 $5 or 3 $5 1st is preferred since $5 should be saved for $10 bill payments
                    tens--;
                    fives--;

                }
                else {
                    fives-=3;
                }

            }
            if (fives<0) return false;


        }

        return true;



    }
}
