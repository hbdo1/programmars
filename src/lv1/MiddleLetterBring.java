package lv1;

public class MiddleLetterBring {
    public String solution(String s) {
        String answer = "";
        int count = s.length();

        if (count % 2 == 1) {
                answer = String.valueOf(s.charAt(count / 2));
        } else {
                answer = String.valueOf(s.charAt((count / 2) - 1)) + String.valueOf(s.charAt(count / 2));
        }

        return answer;
    }
}
