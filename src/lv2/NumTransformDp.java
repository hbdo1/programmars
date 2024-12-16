package lv2;

import java.util.Arrays;

public class NumTransformDp {
    public int solution(int x, int y, int n) {

        // https://sangddongvoid.tistory.com/97
        int[] dp = new int[1000001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[x] = 0;

        for (int i = x; i <= y; i++) {
            if (dp[i] == Integer.MAX_VALUE)
                continue;
            if (i * 2 <= y)
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            if (i * 3 <= y)
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            if (i + n <= y)
                dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
        }
        if (dp[y] == Integer.MAX_VALUE)
            return -1;
        return dp[y];
    }

}
