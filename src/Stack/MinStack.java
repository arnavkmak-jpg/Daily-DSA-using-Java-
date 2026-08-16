package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }
    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty()||minStack.peek()>value){
            minStack.push(value);
        }
        else {
            minStack.push(minStack.peek());
        }

    }

    public void pop() {
        stack.pop();

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();


    }
}
