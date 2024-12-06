package lv2;

import java.util.HashMap;

public class Tuple {
    public static int[] solution(String s) {

        int count = -1;
        for (int i = 0; i < s.length(); i++) { // 집합 개수 구하기
            if (s.charAt(i) == '}') {
                count++;
            }
        }

        int[] answer = new int[count];

        s = s.replace("{", "");
        s = s.replace("}", "");

        String[] arr = s.split(",");

        HashMap<String, Integer> map = new HashMap<>();

        for (String string : arr) {
            map.put(string, 0);
        }
        for (String string : arr) {
            map.put(string, map.get(string) + 1);
        }

        int idx = 0;
        while (count > 0) {
            for (String mapKey : map.keySet()){
                if (map.get(mapKey) == count) {
                    answer[idx++] = Integer.parseInt(mapKey);
                    count--;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }
}
