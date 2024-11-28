package lv2;


import java.util.HashSet;
import java.util.Set;

public class ConsecutivelyPartProgressionSumCount {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        // 길이가 1,2,3..
        for (int i = 1; i <= elements.length; i++) {
            // 수열의 길이를 세아려야함.
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                // 수열의 합을 계산할 때 시작하는 인덱스가 계속 변해야함.
                for (int k = j; k < j + i; k++){
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}
