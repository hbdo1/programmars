package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class NumTransformBfs {
    public int solution(int x, int y, int n) {

        // 최소 연산 횟수를 보니까 bfs 써야할거 같다. queue 사용
        return bfs(x,y,n);
    }

    int bfs(int x, int y, int n) {
        int answer = -1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, 0});
        // 만약 hashmap 사용시 비효율
        boolean[] checkPoint = new boolean[1000001];

        while(!q.isEmpty()) {
            int[] num = q.poll();

            if (num[0] == y) {
                return num[1];
            }

            if (num[0] + n <= y && !checkPoint[num[0] + n]) {
                q.add(new int[]{num[0] + n, num[1] + 1}); // ++num[1]을 하면 복사된 num[1]값이 아닌 num[1] 자체가 ++ 되어서 이상해진다.
                checkPoint[num[0] + n] = true;
            }
            if (num[0] * 2 <= y && !checkPoint[num[0] * 2]) {
                q.add(new int[]{num[0] * 2, num[1] + 1});
                checkPoint[num[0] * 2] = true;
            }
            if (num[0] * 3 <= y && !checkPoint[num[0] * 3]) {
                q.add(new int[]{num[0] * 3, num[1] + 1});
                checkPoint[num[0] * 3] = true;
            }
        }
        return answer;
    }
}
