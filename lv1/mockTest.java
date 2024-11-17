package lv1;

import java.util.ArrayList;

public class mockTest {
    public int[] solution(int[] answers) {
        ArrayList<Integer> preanswer = new ArrayList<>();
        int[] ans1 = new int[answers.length];
        int[] ans2 = new int[answers.length];
        int[] ans3 = new int[answers.length];
        int count2 = 0;
        int[] ansCount = new int[3];

        for (int i = 0; i < answers.length; i++) {
            ans1[i] = i % 5 + 1; // 0번째 index = 1 ,,, 4번째 인덱스 5, 5번째 인덱스 1

            int[] num2 = {1,3,4,5};

            if (i % 2 == 0) { //짝수 번째  2
                ans2[i] = 2;
            } else { //홀수 번째 1,3,4,5
                ans2[i] = num2[count2 % 4];
                count2++;
            }
            int[] num3 = {3,1,2,4,5}; // 3,3,1,1,2,2,4,4,5,5
            ans3[i] = num3[i % 10 / 2];
        }

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ans1[i]) {
                ansCount[0]++;
            }
            if (answers[i] == ans2[i]) {
                ansCount[1]++;
            }
            if (answers[i] == ans3[i]) {
                ansCount[2]++;
            }

        }
        int max = ansCount[0];
        for (int i = 0; i < 3; i++) {
            if (max < ansCount[i]) {
                max = ansCount[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (max == ansCount[i]) {
                preanswer.add(i + 1);

            }
        }
        int[] answer = new int[preanswer.size()];
        for (int i = 0 ; i < preanswer.size() ; i++ ) {
            answer[i] = preanswer.get(i).intValue();
        }
        return answer;
    }
}
