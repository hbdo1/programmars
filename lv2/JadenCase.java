package lv2;

import java.util.ArrayList;

public class JadenCase {
    public String solution(String s) {
        // 공백 여러개도 그대로 내야함
        int count = 0;
        s = s.toLowerCase();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(Character.toString(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if (count == 0 && !list.get(i).equals(" ")) {
                list.set(i, list.get(i).toUpperCase());
                count++;
            }
            if (list.get(i).equals(" ")) {
                count = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String string : list) {
            sb.append(string);
        }
        return sb.toString();
    }
}

