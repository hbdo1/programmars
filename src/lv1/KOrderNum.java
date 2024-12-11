package lv1;

import java.util.*;
public class KOrderNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<>(commands[i][1] - commands[i][0] + 1);
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j - 1]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);

        }

        return answer;
    }
}
