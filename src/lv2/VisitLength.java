package lv2;

import java.util.HashMap;

public class VisitLength {
    public int solution(String dirs) {
        boolean[][][] route = new boolean[11][11][4];
        int row = 5;
        int column = 5;

        int answer = 0;
        for (int i = 0; i < dirs.length(); i++) {
            char direction = dirs.charAt(i);
            if (direction == 'U') {
                if (row == 10) {
                    continue;
                }
                if (!route[row][column][0]) {
                    answer++;
                    route[row][column][0] = true;
                    route[++row][column][1] = true;
                } else {
                    row++;
                }

            } else if (direction == 'D') {
                if (row == 0) {
                    continue;
                }
                if (!route[row][column][1]) {
                    answer++;
                    route[row][column][1] = true;
                    route[--row][column][0] = true;
                } else {
                    row--;
                }
            } else if (direction == 'R') {
                if (column == 10) {
                    continue;
                }
                if (!route[row][column][2]) {
                    answer++;
                    route[row][column][2] = true;
                    route[row][++column][3] = true;
                } else {
                    column++;
                }
            } else if (direction == 'L') {
                if (column == 0) {
                    continue;
                }
                if (!route[row][column][3]) {
                    answer++;
                    route[row][column][3] = true;
                    route[row][--column][2] = true;
                } else {
                    column--;
                }
            }
        }
        return answer;
    }

}
