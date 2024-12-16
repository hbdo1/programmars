package lv2;


import java.util.Stack;

public class DeliveryBox {
    public int solution(int[] order) {

        // 참고 풀이
        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        int idx = 0;
        for (int i = 1; i <= order.length; i++) {
            stack.add(i);
            while (!stack.isEmpty()) {
                if (stack.peek() == order[idx]){
                    stack.pop();
                    answer++;
                    idx++;
                } else {
                    break;
                }
            }
        }




        return answer;
    }
}
