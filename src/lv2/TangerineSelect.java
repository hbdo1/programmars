package lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TangerineSelect {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : tangerine) {
            map.put(j, 0);
        }
        for (int j : tangerine) {
            map.put(j, map.get(j) + 1);
        }

        Integer[] count = new Integer[map.size()];
        int i = 0;
        for (Integer key: map.keySet()) {
            count[i] = map.get(key);
            i++;
        }
        Arrays.sort(count, Collections.reverseOrder());
        for (int a : count) {
            if (k - a >= 0){
                k -= a;
                answer++;
            } else {
                while (k >= 0) {
                    k--;
                }
                answer++;
            }
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}
