package lv1;

public class qnwhrgks_rmador_rPtksgkrl {
    public long solution(int price, long money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            money -= i * (long) price; // money에는 long 형이 들어가도 int 형으로 저장되어 오버플로우 발생
        }

        if (money < 0) {
            answer -= money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
