package lv1;

import java.util.*;
public class Fruiterer {
    public int solution(int k, int m, int[] score) { // k: 사과의 최대 점수 , m : 한 상자에 들어가는 사과의 수
        int answer = 0;
        // 빈 상자 만들기
        int[] emptyBox = new int[m];
        // 상자의 구성을 만들자. 값이 큰 거부터 담으면 될거 같다.
        Arrays.sort(score);
        int emptyBoxIndex = m - 1;
        for (int i = score.length - 1; i >= 0; i--) {
            // 상자에 과일을 담았다.
            emptyBox[emptyBoxIndex] = score[i];

            // 상자가 다 찼을 때
            if (emptyBoxIndex == 0) {
                answer += emptyBox[0] * m;
                emptyBoxIndex = m - 1;
                continue;
            }
            emptyBoxIndex--;
        }
        return answer;
    }
}
