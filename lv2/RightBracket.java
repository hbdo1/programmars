package lv2;

import java.util.Stack;

public class RightBracket {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(s.substring(i, i + 1));
            } else if (stack.peek().equals("(") && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(s.substring(i, i + 1));
            }
        }
        return stack.isEmpty();
    }
}
