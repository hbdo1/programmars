package lv2;

public class ArrCut {
    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];

        int index = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n + 1;
            long col = i % n + 1;
            answer[index++] = (int) Math.max(row, col);
        }

        return answer;
    }
}
