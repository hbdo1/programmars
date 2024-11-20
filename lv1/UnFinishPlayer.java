package lv1;
import java.util.*;
public class UnFinishPlayer {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int count = 0;
        for (count = 0; count < completion.length; count++) {
            if (!participant[count].equals(completion[count])) {
                break;
            }
        }
        answer += participant[count];
        return answer;
    }
}
