package lv1;

public class year2016 {
    public String solution(int a, int b) {
        String answer = "";

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int numberDays = 0;
        int month = 1;

        if (a == 1) { //1월이면
            numberDays += b - 1;
        } else {
            for (int i = 1; i <= a; i++) {
                // a 월에 일수
                if (i == a) {
                    numberDays += b;
                    break;
                }
                // 1,3,5,7,8,10,12월은 31일
                if ((i % 2 == 1 && i <= 7 && i > 1) || (i % 2 ==0 && i >= 8)) {
                    numberDays += 31;
                } else if (i == 2) {
                    numberDays += 29;
                } else {
                    numberDays += 30;
                }
            }
        }

        answer = day[numberDays % 7];
        return answer;
    }
}
