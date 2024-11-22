package lv1;

import java.util.Arrays;

public class GymUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == reserve[i]) {
                    lost[j] = -1;
                    reserve[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == reserve[i] + 1 || lost[j] == reserve[i] - 1) {
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }

        }
        return answer;

    }
}