package lv1;

import java.util.*;

public class HallOfFame1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> hallof= new ArrayList<Integer>();


        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hallof.add(score[i]);
                Collections.sort(hallof);
                answer[i] = hallof.get(0);
            } else {
                hallof.add(score[i]);
                Collections.sort(hallof);
                answer[i] = hallof.get(1);
                hallof.remove(0);
            }

        }
        return answer;
    }

}
