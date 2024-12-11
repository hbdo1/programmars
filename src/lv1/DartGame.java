package lv1;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;

        String[] dartArray = dartResult.split("");
        int[] score = new int[3];
        int index = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            if (dartArray[i].matches("[0-9]")) {
                index++;
                score[index] = Integer.parseInt(dartArray[i]);
                if (dartArray[i + 1].equals("0")) {
                    score[index] *= 10;
                    i++;
                }

            }

            if (dartArray[i].equals("D")) {
                score[index] = (int)Math.pow(score[index], 2);
            } else if (dartArray[i].equals("T")) {
                score[index] = (int)Math.pow(score[index], 3);
            } else if (dartArray[i].equals("#")) {
                score[index] *= -1;
            } else if (dartArray[i].equals("*")) {
                if (index == 0) {
                    score[index] *= 2;
                } else {
                    score[index - 1] *= 2;
                    score[index] *= 2;
                }
            }
        }
        for (int i = 0; i < score.length; i++) {
            answer += score[i];
        }
        return answer;
    }
}
