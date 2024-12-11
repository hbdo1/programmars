package lv2;

public class EnglishWordChainGame {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int idx1 = -1, idx2 = -1;
        // 끝자리가 다를 때 인덱스
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                idx1 = i + 1;
                break;
            }
        }
        // 중복된 단어 인덱스
        String s = "";
        for (int i = 0; i < words.length - 1; i++) {
            s += words[i] + ",";
            for (int j = 0; j < s.split(",").length; j++) {
                if(s.split(",")[j].equals(words[i + 1])) {
                    idx2 = i + 1;
                    break;
                }
            }
            if (idx2 != -1) {
                break;
            }
        }

        int idx = 0;
        if (idx1 == -1 && idx2 == -1) {
            return answer;
        } else if (idx1 >= 0 && idx2 == -1) {
            idx = idx1;
        } else if (idx1 == -1 && idx2 >= 0) {
            idx = idx2;
        } else {
            idx = Math.min(idx1, idx2);
        }
        answer[0] = (idx % n) + 1;
        answer[1] = (idx / n) + 1;
        return answer;
    }
}
