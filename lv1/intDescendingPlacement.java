package lv1;

import java.util.Arrays;

public class intDescendingPlacement {
    public long solution(long n) {
        long answer = 0;
        int count = 0;
        long m = n;
        while (m != 0) {
            count++;
            m /= 10;
        }
        String[] list = new String[count];
        for (int i = 0; i < count; i++) {
            list[i] = Long.toString(n % 10);
            n /= 10;
        }
        Arrays.sort(list);
        String ans = "";
        for (int i = list.length - 1; i >=0 ; i--) {
            ans += list[i];
        }
        answer = Long.parseLong(ans);
        return answer;
    }
}
