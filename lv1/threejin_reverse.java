package lv1;

public class threejin_reverse {
    public int solution(int n) {
        int answer = 0;
        String pre = "";
        while (n > 0) {
            pre = pre + Integer.toString(n % 3) ;
            n /= 3;
        }
        answer = Integer.parseInt(pre,3);
        return answer;
    }

}
