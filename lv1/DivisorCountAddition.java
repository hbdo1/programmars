package lv1;

public class DivisorCountAddition {

    public int solution(int left, int right) {
        int answer = 0;

        int divisorCount = 0;
        while (left <= right) {
            for (int i = 1; i <= left; i++) {
                if (left % i == 0) {
                        divisorCount++;
                }
            }
            if (divisorCount % 2 == 0) {
                    answer += left;
            } else {
                    answer -= left;
            }
                divisorCount = 0;
                left++;
        }

        return answer;
        }

}
