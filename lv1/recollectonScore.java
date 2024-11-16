package lv1;

public class recollectonScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer =  new int [photo.length];

        for (int i = 0; i < photo.length; i++) { //result 더하기 횟수
            for (int j = 0; j < name.length; j++) { // name 비교 횟수
                for (int k = 0; k < photo[i].length; k++) { // photo의 있는 요소 만큼 계산
                    if (photo[i][k].equals(name[j])) {
                        answer[i] += yearning[j];
                    }
                }
            }
        }

        return answer;
    }
}
