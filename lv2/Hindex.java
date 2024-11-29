package lv2;


import java.util.Arrays;

public class Hindex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int citation : citations) {
            int count = 0;
            for (int i : citations) {
                if (citation <= i) {
                    count++;
                }
            }
            int hIdx = Math.min(citation, count);
            if (answer < hIdx) {
                answer = hIdx;
            }
        }
        return answer;


    }
}
