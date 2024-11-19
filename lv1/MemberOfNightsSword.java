package lv1;

public class MemberOfNightsSword {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {//기사단원 수
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) { //기사단원 약수 개수 구하기
                if (i % j == 0) {
                    count += 2;
                }
                if (i % j == 0 && i / j == j) {
                    count -= 1;
                }
            }
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
}
