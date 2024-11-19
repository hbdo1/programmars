package lv1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = "";
            int[] sec1 = new int[n];
            int[] sec2 = new int[n];

            for (int j = n - 1; j >=0; j--) {
                sec1[j] = arr1[i] % 2;
                arr1[i] /= 2;
            }
            for (int j = n - 1; j >=0; j--) {
                sec2[j] = arr2[i] % 2;
                arr2[i] /= 2;
            }

            for (int j = 0; j < n; j++) {
                if (sec1[j] == 1 || sec2[j] == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }

        }
        return answer;
    }
}
