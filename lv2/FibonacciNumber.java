package lv2;

public class FibonacciNumber {
    public int solution(int n) {
        int num = 0 , n0 = 0, n1 = 1;
        for (int i = 2; i <= n; i++) {
            num = ((n0 % 1234567) + (n1 % 1234567)) % 1234567;
            n0 = n1;
            n1 = num;

        }

        return num;
    }
}
