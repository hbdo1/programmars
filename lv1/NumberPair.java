package lv1;

import java.util.*;
public class NumberPair {
    public String solution(String X, String Y) {
        StringBuilder s = new StringBuilder();

        int xLength = X.length();
        int yLength = Y.length();

        for (int i = 0; i <= 9; i++) {
            int xiCount = X.replace(String.valueOf(i),"").length();
            int yiCount = Y.replace(String.valueOf(i),"").length();

            int xCount = xLength - xiCount;
            int yCount = yLength - yiCount;

            int count = 0;
            if (xCount >= yCount) {
                count = yCount;
            } else {
                count = xCount;
            }
            if (count == 0) {
                continue;
            }
            for (int j = 0; j < count; j++) {
                s.append(i);
            }
        }

        String answer = s.reverse().toString();

        if (answer.equals("")){
            answer = "-1";
        } else if (answer.replace("0","").equals("")) {
            answer = "0";
        }
        return answer;
    }
}
