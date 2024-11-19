package lv1;

public class StringDivide {
    public int solution(String s) {
        int answer = 0;
        String firstLetter = "";
        int firstCount = 0;
        int afterCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count == 0) {
                firstLetter = Character.toString(s.charAt(i));
                firstCount++;
            } else if (Character.toString(s.charAt(i)).equals(firstLetter)) {
                firstCount++;
            } else {
                afterCount++;
            }
            if (firstCount == afterCount) {
                answer++;
                count = 0;
                firstCount = 0;
                afterCount = 0;
                continue;
            }
            if (i == s.length() - 1) {
                answer++;
            }
            count++;
        }
        return answer;
    }
}
