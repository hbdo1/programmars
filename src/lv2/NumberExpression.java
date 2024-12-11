package lv2;

public class NumberExpression {
    public int solution(int n) {
        int answer = 1;
        int num = 0;
        if (n != 1 && n != 2) {
            for (int i = 1; i <= (n / 2) + 1; i++) {
                for (int j = i; j <= (n / 2) + 1; j++) {
                    num += j;
                    if (num == n) {
                        answer++;
                        num = 0;
                        break;
                    } else if (num > n) {
                        num = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
