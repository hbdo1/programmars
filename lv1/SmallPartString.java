package lv1;

public class SmallPartString {
    public int solution(String t, String p) {
        int answer = 0;
        //기준 숫자의 길이
        long compareNum = Integer.parseInt(p); //기준 숫자
        for (int i = 0; i <= (t.length() - p.length()); i++) {
            long num = Long.parseLong(t.substring(i,i+p.length()));
            if (compareNum >= num) {
                answer++;
            }
        }
        return answer;
    }


}
