package lv1;

public class LottoHighestLowestRank {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxCount = 0;
        int minCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < win_nums.length; i++) {
            if (lottos[i] == 0){
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (win_nums[j] == lottos[i]) {
                    minCount++;
                }
            }

        }
        maxCount = minCount + zeroCount;
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 7; i++) {
            if (maxCount == i) {
                answer[0] = rank[i];
            }
            if (minCount == i) {
                answer[1] = rank[i];
            }
        }
        return answer;
    }
}
