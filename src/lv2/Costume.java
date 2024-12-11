package lv2;

import java.util.*;

public class Costume {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], 0);
        }

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.get(clothe[1]) + 1);
        }

        for (String s : map.keySet()) {

            answer *= map.get(s) + 1;
        }
        answer -= 1;
        return answer;
    }
}
