package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {

    public int solution(int[][] maps) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1});

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {

            int[] now = q.poll();

            int x = now[0];
            int y = now[1];
            int distance = now[2];

            if (x == maps.length - 1 && y == maps[0].length - 1) {
                answer = distance;
                return answer;
            }
            for (int[] direction : directions) {
                int nextX = x + direction[0];
                int nextY = y + direction[1];

                if (nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY < maps[0].length && maps[nextX][nextY] == 1) {
                    maps[nextX][nextY] = 0;
                    q.offer(new int[]{nextX, nextY, distance + 1});
                }
            }
        }

        return -1;

    }
}