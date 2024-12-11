package lv2;

import java.util.*;

public class MinMade {
    public int solution(int[] A, int[] B){
        int answer1 = 0;
        int answer2 = 0;
        Integer[] arrA = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            arrA[i] = A[i];
        }
        Integer[] arrB = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            arrB[i] = B[i];
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i <arrA.length; i++) {
            answer1 += arrA[i] * arrB[arrA.length - i - 1];
        }

        for (int i = 0; i <arrA.length; i++) {
            answer2 += arrA[arrA.length - i - 1] * arrB[i];
        }

        int answer = (answer1 >= answer2) ? answer1 : answer2;
        return answer;
    }
}
