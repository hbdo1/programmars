package lv1;

public class SameNumberHate {
    public int[] solution(int []arr) {

        int count = 1;
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) { //answer[] 크기 계산
            if (num != arr[i]) {
                num = arr[i];
                count++;
            }
        }
        int[] answer = new int[count];
        num = 0;
        answer[num] = arr[0];
        for (int i =1; i < arr.length; i++) {
            if (answer[num] != arr[i]) {
                num++;
                answer[num] = arr[i];
            }
        }

        return answer;
    }
}
