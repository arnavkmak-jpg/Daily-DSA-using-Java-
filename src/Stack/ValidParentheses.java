package Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        //Input: s = "()[]{}"
        //Input: s = "([])"
        //Input: s = "([)]"

        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        char[] letters = s.toCharArray();

        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        for (char c:letters){
            if (map.containsKey(c)){
                stack.push(c);

            }
            else {
                if (stack.isEmpty()||c!=map.get(stack.peek())){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }
}
