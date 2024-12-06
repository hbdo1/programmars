package lv2;

import java.util.Arrays;

public class NLeastCommonMultiple {
    public int solution(int[] arr) {
        int answer = 1;

        Arrays.sort(arr);

        while (true) {
            int min = arr[0];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (1 < arr[i]) {
                    if (min == 1) {
                        min = arr[i];
                    } else if (arr[i] < min) {
                        min = arr[i];
                    }
                }
            }
            if (min == 1) {
                break;
            }
            for (int i = 2; i <= min; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] % i == 0) {
                        arr[j] /= i;
                        count++;
                    }
                }
                if (count != 0) {
                    answer *= i;
                    break;
                }
            }
            if (count == 0) {
                break;
            }

        }
        for (int j : arr) {
            answer *= j;
        }
        return answer;
    }
}
