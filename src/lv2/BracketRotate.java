package lv2;

public class BracketRotate {
    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String word = "";
            if (i != 0) {
                word = s.substring(i) + s.substring(0, i);
            } else {
                word = s;
            }
            while (!word.isEmpty()) {
                if (word.contains("()")) {
                    word = word.replace("()", "");
                } else if (word.contains("{}")) {
                    word = word.replace("{}", "");
                } else if (word.contains("[]")) {
                    word = word.replace("[]","");
                } else {
                    break;
                }
            }
            if (word.isEmpty()) {
                answer++;
            }
        }
        return answer;


    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }
}
