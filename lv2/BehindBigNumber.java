package lv2;

import java.util.Stack;

public class BehindBigNumber {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();

        int idx = numbers.length - 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                answer[idx--] = -1;
                stack.push(numbers[i]);
            } else if (stack.peek() > numbers[i]) {
                answer[idx--] = stack.peek();
                stack.push(numbers[i]);
            } else {
                stack.pop();
                i++;
            }
        }
        return answer;
    }

}
