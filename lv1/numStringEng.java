package lv1;

public class numStringEng {
    public int solution(String s) {


        String[] numEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numEng.length; i++) {
            if (s.contains(numEng[i])) {
                s = s.replace(numEng[i], Integer.toString(i));
            }

        }
        return Integer.parseInt(s);
    }
}