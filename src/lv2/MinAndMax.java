package lv2;

public class MinAndMax {
    public String solution(String s) {
        String answer = "";
        String[] s2 = s.split(" ");
        int[] s3 = new int[s2.length];
        int min = Integer.parseInt(s2[0]), max = Integer.parseInt(s2[0]);
        for (int i = 1; i < s2.length; i++) {
            s3[i] = Integer.parseInt(s2[i]);
            if (s3[i] > max) {
                max = s3[i];
            }
            if (s3[i] < min) {
                min = s3[i];
            }
        }
        answer = answer.concat(min + " " + max);
        return answer;
    }
}
