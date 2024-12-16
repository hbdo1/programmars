package lv2;


import java.util.LinkedList;
import java.util.Queue;

public class StockPriceQueue {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> q = new LinkedList<>();


        for (int i = 0; i < prices.length; i++) {
            q.add(prices[i]);
        }
        int idx = 0;
        while (!q.isEmpty()) {
            int num = q.poll();
            for (int i : q) {
                answer[idx]++;
                if (num > i) {
                    break;
                }
            }
            idx++;
        }



        return answer;
    }
}
