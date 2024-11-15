package lv1;

import java.util.ArrayList;
import java.util.Collections;

public class selectTwoSum {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>(1);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int key = 0;
                for (int k = 0; k < list.size(); k++) {
                    if (list.contains(numbers[i] + numbers[j])) {
                        key = -1;
                    }
                }
                if (key == -1) {
                    continue;
                }
                list.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
