package lv2;

import java.util.Stack;

public class PartnerRemove {
    public int solution(String s){
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.substring(i, i + 1));
            } else if (stack.peek().equals(s.substring(i, i + 1))) {
                stack.pop();
            } else {
                stack.push(s.substring(i, i + 1));
            }
        }
        if (stack.isEmpty()) {
            return 1;
        }
        return answer;
    }
}
