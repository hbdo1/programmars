package lv1;

public class BetweenSecretCode {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c = (char)(c + 1); // c += 1 -> c = c + 1
                if (c > 'z') {
                    c = (char)(c - 26);
                }
                if (skip.contains(Character.toString(c))) {
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }
}
