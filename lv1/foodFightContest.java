package lv1;

public class foodFightContest {

    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            food[i] /= 2;
        }
        for (int i = 1; i <food.length; i++) {
            if (food[i] > 0) {
                for (int j = 0; j <food[i]; j++) {
                    answer += Integer.toString(i);
                }
            }
        }
        StringBuffer place = new StringBuffer(answer);
        answer = answer + Integer.toString(0) + place.reverse().toString();

        return answer;
    }
}
