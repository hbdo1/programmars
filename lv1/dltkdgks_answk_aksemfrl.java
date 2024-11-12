package lv1;

public class dltkdgks_answk_aksemfrl {
    public String solution(String s) {
        String answer = "";

        int key = 0;
        String data[] = s.split("");
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(" ")) {
                key = 0;
            } else {
                if (key % 2 == 0) {
                    data[i] = data[i].toUpperCase();
                    key++;
                } else {
                    data[i] = data[i].toLowerCase();
                    key++;
                }
            }
            answer += data[i];
        }
        return answer;
    }
}

