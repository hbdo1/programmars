package lv2;


import java.util.HashMap;

public class DiscountEvent {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        // 원하는 물품과 수량 map
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        // discount 물품과 수량

        for (int i = 0; i < discount.length - 10 + 1; i++) {
            int key = -1;
            HashMap<String, Integer> discountMap = new HashMap<>();
            for (String s : want) {
                discountMap.put(s, 0);
            }
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], 0);
            }
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.get(discount[j]) + 1);
            }
            for (String mapKey : map.keySet()) {
                if (!map.get(mapKey).equals(discountMap.get(mapKey))) {
                    key = 0;
                    break;
                }
            }
            if (key == -1) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));;
    }
}
