package lv1;

public class KeyPadPress {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftFinger = 10;
        int rightFinger = 12;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftFinger = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rightFinger = numbers[i];
            } else {
                if (numbers[i] == 0) {
                    numbers[i] = 11;
                }
                if (Math.abs(numbers[i] -leftFinger) / 3 + Math.abs(numbers[i] -leftFinger) % 3> Math.abs(numbers[i] -rightFinger) / 3 + Math.abs(numbers[i] -rightFinger) % 3) {
                    answer += "R";
                    rightFinger = numbers[i];
                } else if (Math.abs(numbers[i] -leftFinger) / 3 + Math.abs(numbers[i] -leftFinger) % 3< Math.abs(numbers[i] -rightFinger) / 3 + Math.abs(numbers[i] -rightFinger) % 3) {
                    answer += "L";
                    leftFinger = numbers[i];
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        leftFinger = numbers[i];
                    } else {
                        answer += "R";
                        rightFinger = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}
