package lv1;
import java.util.*;
public class answkduf_soflacktnsdmfh_qoclgkrl {

    public String solution(String s) {
        String answer = "";

        String arr[] = s.split("");
        Arrays.sort(arr,Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
        }
        return answer;
    }

}