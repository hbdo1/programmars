package lv1;

public class theGreatestCommonFactorAndtheleastcommonMultiple {
    public long[] solution(int n, int m) {

        int temp = n;
        if (n > m) {
            n = m;
            m = temp;
        }
        //최대공약수
        long greatestCommonFactor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                greatestCommonFactor = i;
            }
        }
        //최소공배수
        long leastCommonMulitple = 0;
        if (m % n == 0) {
            leastCommonMulitple = m;
        } else {
            long nS = n / greatestCommonFactor;
            long mS = m / greatestCommonFactor;
            leastCommonMulitple = nS * mS * greatestCommonFactor;
        }
        long[] answer = {greatestCommonFactor, leastCommonMulitple};
        return answer;
    }

}
