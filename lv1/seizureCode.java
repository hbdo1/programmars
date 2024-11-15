package lv1;

public class seizureCode {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals(" ")) {
                answer += Character.toString((s.charAt(i)));
                continue;
            }
            int asc = s.charAt(i);
            for (int j = 0; j < n; j++) {
                if (asc == 90){
                    asc = 65;
                    continue;
                } else if (asc == 122) {
                    asc = 97;
                    continue;
                }
                asc++;
            }
            answer += Character.toString((char)asc);
        }

        return answer;
    }
}
