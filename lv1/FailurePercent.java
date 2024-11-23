package lv1;



import java.util.*;

public class FailurePercent {
    public int[] solution(int N, int[] stages) {

        int challenger = stages.length;
        int[] failCount = new int[N + 1];
        //실패한 사람 저장하기
        for (int i = 0; i < stages.length; i++) {
            for (int j = 1; j < failCount.length; j++) {
                if (stages[i] == j) {
                    failCount[j]++;
                    break;
                }
            }
        }

        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 1; i < N + 1; i++) {
            if (challenger == 0) {
                map.put(i, 0.0);
                continue;
            }
            map.put(i, (double) failCount[i] / challenger);
            challenger -= failCount[i];
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        return list.stream().mapToInt(i -> i).toArray();

    }
}
