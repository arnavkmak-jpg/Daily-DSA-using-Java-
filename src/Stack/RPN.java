package Stack;

import java.util.Stack;

public class RPN {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String s:tokens){
            switch (s){
                case "+" -> {
                    int A = stack.pop();
                    int B = stack.pop();
                    int sum = B+A;
                    stack.push(sum);
                }
                case "-" -> {
                    int A = stack.pop();
                    int B = stack.pop();
                    int diff = B-A;
                    stack.push(diff);
                }
                case "*" -> {
                    int A = stack.pop();
                    int B = stack.pop();
                    int mult = B*A;
                    stack.push(mult);
                }
                case "/" -> {
                    int A = stack.pop();
                    int B = stack.pop();
                    int div = B/A;
                    stack.push(div);
                }
                default -> {
                    int val = Integer.parseInt(s);
                    stack.push(val);
                }
            }
        }
        return stack.pop();

    }
}
