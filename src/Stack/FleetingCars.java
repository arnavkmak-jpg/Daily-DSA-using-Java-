package Stack;

import java.util.Arrays;
import java.util.Stack;

public class FleetingCars {
    public int carFleet(int target, int[] position, int[] speed) {
        //Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]

        int[][] pair = new int[position.length][2]; //creating pairs of both position and speed for ex [10,2],[8,4]
        for (int i = 0; i<position.length; i++){
            pair[i][0] = position[i]; //adding position as 1st element of each pair and speed as 2nd element of each pair where i represents the row number
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(b[0],a[0]));//reverse sorting the pairs
        Stack<Double> stack = new Stack<>();
        for (int[] p:pair){ // iterate through each pair of position and speed p represents a single pair
            stack.push((double)(target-p[0])/p[1]); // push the time value calculated by dividing distance by speed
                if (stack.size()>=2 && stack.peek()<=stack.get(stack.size()-2)){ // check if our stack has size of 2 or more and if the top element of stack has lower time value than the one preceeding it which means the back farther car reaches before or at the same time as the front car
                    stack.pop(); //pop the stack since their speed merges

                }
            }

        return stack.size(); // our size of the stack will be equivalent to the number of car fleets



    }
}
