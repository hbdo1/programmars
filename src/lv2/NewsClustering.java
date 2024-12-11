package lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class NewsClustering {
    public static int solution(String str1, String str2) {

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            if (!str1.substring(i, i + 2).replaceAll("[A-Z]", "").isEmpty()) {
                continue;
            }
            list1.add(str1.substring(i, i + 2));
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (!str2.substring(i, i + 2).replaceAll("[A-Z]", "").isEmpty()) {
                continue;
            }
            list2.add(str2.substring(i, i + 2));
        }
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String s : list1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : list2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        int commonCount = 0; int sumCount = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                commonCount += Math.min(map1.get(key),map2.get(key));
                sumCount += Math.max(map1.get(key),map2.get(key));
                map2.remove(key);
            } else {
                sumCount += map1.get(key);
            }
        }
        for (String key : map2.keySet()) {
            sumCount += map2.get(key);

        }
        if (sumCount == 0 && commonCount == 0) {
            return 65536;
        }

        return  (int) ((commonCount / (double) sumCount) * 65536);
    }

    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";

        System.out.println(solution(str1,str2));
    }
}
