package lv1;

public class CardBundle {
    public String solution(String[] cards1, String[] cards2, String[] goal) {


        int num1 = 0, num2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (!goal[i].equals(cards1[num1]) && !goal[i].equals(cards2[num2])) {
                return "No";
            } else if (goal[i].equals(cards1[num1])) {
                if (num1 < cards1.length - 1) {
                    num1++;
                }
            } else {
                if (num2 < cards2.length - 1) {
                    num2++;
                }
            }
        }
        return "Yes";

    }
}
