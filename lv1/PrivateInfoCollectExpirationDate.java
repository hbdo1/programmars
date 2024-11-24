package lv1;

import java.util.HashMap;

public class PrivateInfoCollectExpirationDate {
    public int[] solution(String today, String[] terms, String[] privacies) {

        today = today.replace(".","");
        int todayDate = Integer.parseInt(today.substring(0,4)) * 28 * 12 + (Integer.parseInt(today.substring(4,6))) * 28 + Integer.parseInt(today.substring(6,8));

        int[] privateExpireDate = new int[privacies.length];
        // 약관종류, 유효기간 map 보관
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String term = terms[i].split(" ")[0];
            Integer expireDate = Integer.parseInt(terms[i].split(" ")[1]);
            map.put(term, expireDate);
        }

        // 개인마다 약정에 맞는 유효기간 꺼내오기
        int[] resultPrivateDate = new int[privacies.length];
        int num = 0;
        for (int i = 0; i < privacies.length; i++) {
            String privateTerm = privacies[i].split(" ")[1];
            privateExpireDate[i] = map.get(privateTerm);
            // 개인마다 만료 유효기간 계산하기
            //privacies[i].split(" ")[0] = 개인정보 수집 일자
            String privateCollectDate = privacies[i].split(" ")[0].replace(".","");
            resultPrivateDate[i] = Integer.parseInt(privateCollectDate.substring(0,4)) * 28 * 12 + (Integer.parseInt(privateCollectDate.substring(4,6))+ privateExpireDate[i]) * 28 + Integer.parseInt(privateCollectDate.substring(6,8));

            if (resultPrivateDate[i] <= todayDate) {
                num++;
            }
        }
        int count = 0;
        int[] answer = new int[num];
        for (int i = 0; i < privacies.length; i++) {
            if (resultPrivateDate[i] <= todayDate) {
                answer[count] = i + 1;
                count++;
            }
        }
        return answer;
    }
}
