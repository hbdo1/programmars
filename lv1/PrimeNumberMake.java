package lv1;

public class PrimeNumberMake {
    public int solution(int n) {
        int answer = 0;
        boolean[] list = new boolean[n + 1];

        for (int i = 2; i <= (int)Math.sqrt(n); i++) { // n이 2와 3일 때는 이 반복문이 실행되지 않는다. 대신에 2,3 배수가 없기 때문에 상관없다.
            if (list[i] == true) {
                continue;
            }
            for (int j = i * i; j < list.length; j = j + i) {
                list[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (list[i] == false) {
                answer++;
            }
        }
        return answer;
    }
}
