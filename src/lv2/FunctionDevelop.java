package lv2;


import java.util.ArrayList;
import java.util.Stack;

public class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                days[i]++;
            }
        }
        Stack<Integer> order = new Stack<>();
        for (int i = 0; i < progresses.length; i++) {
            if (order.isEmpty()) {
                order.push(days[i]);
            } else if (days[i] > order.peek()) {
                order.pop();
                ans.add(count);
                count = 1;
                order.push(days[i]);
            } else { // days[i] <= order.peek()
                count++;
            }
            if (i == progresses.length - 1) {
                ans.add(count);
            }
        }

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
