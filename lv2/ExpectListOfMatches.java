package lv2;

public class ExpectListOfMatches {
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while (true) {
            if (a % 2 != 0) {
                a++;
            }
            if (b % 2 != 0) {
                b++;
            }
            if (a / 2 == b / 2) {
                return answer;
            } else {
                a /= 2; b /= 2;
                answer++;
            }
        }
    }
}
