package lv1;

import java.util.HashMap;

public class PersonaliyTypeCheck {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        HashMap<String, Integer> h1 = new HashMap<>();
        String[] personalityType = {"R", "T", "C", "F", "J", "M", "A", "N"};

        for (String personality : personalityType) {
            h1.put(personality, 0);
        }


        for (int i = 0; i < choices.length; i++) {
            String type = "";

            if (choices[i] == 1 || choices[i] == 2 || choices[i] == 3) {
                type = survey[i].substring(0,1);
                if (choices[i] == 1) {

                    h1.put(type, h1.get(type) + 3);
                } else if (choices[i] == 3) {

                    h1.put(type, h1.get(type) + 1);
                } else {

                    h1.put(type, h1.get(type) + 2);
                }
            } else if (choices[i] == 5 || choices[i] == 6 || choices[i] == 7) {
                type = survey[i].substring(1,2);

                h1.put(type, h1.get(type) +choices[i] - 4);
            }


        }

        for (int i = 0; i < 4; i++) { //문제없음
            if (h1.get(personalityType[2 * i]) >= h1.get(personalityType[2 * i + 1])) {
                answer += personalityType[2 * i];
            } else if (h1.get(personalityType[2 * i]) < h1.get(personalityType[2 * i + 1])) {
                answer += personalityType[2 * i + 1];
            }
        }
        return answer;
    }
}
