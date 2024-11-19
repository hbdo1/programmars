package lv1;

public class Reapply {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n + 1]; // 0에서 n 까지
        for (int i = 0; i < section.length; i++) { //칠해야할 구역 생성
            paint[section[i]] = true;
        }

        for (int i = 1; i < paint.length; i++) {
            if (paint[i]) {
                answer++;
                for (int j = 0; j < m; j++) {
                    if (j + i == paint.length) {
                        break;
                    }
                    paint[j + i] = false;
                }
                i += m - 1;
            }

        }
        return answer;
    }
}
