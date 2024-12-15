package lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Process {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
