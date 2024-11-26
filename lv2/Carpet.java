package lv2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int[] num = new int[2];
        int total = brown + yellow;
        for (int i = 1; i <= (int)Math.sqrt(total); i++) {
            if (total % i == 0) {
                num[0] = total / i;
                num[1] = i;
                if (yellow == (num[0] - 2) * (num[1] - 2)){
                    answer[0] = num[0];
                    answer[1] = num[1];

                }
            }
        }


        return answer;
    }
}
