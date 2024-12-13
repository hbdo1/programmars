package lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class Compression {
    public static int[] solution(String msg) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(Character.toString((char)('A' + i)), i + 1);
        }

        int preIdx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            sb.append(msg.charAt(i));

            if (map.containsKey(sb.toString())) {
                preIdx= map.get(sb.toString());
            } else {
                map.put(sb.toString(),map.size() + 1);
                list.add(preIdx);
                preIdx = 0;
                sb.setLength(0);
                i--;
            }
        }

        if (preIdx != 0) {
            list.add(preIdx);
        }


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        System.out.println(solution(msg));
    }
}
