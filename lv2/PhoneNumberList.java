package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PhoneNumberList {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(phone_book));
        Collections.sort(list);

        for (int i = 0; i < list.size()- 1; i++) {
            if (list.get(i + 1).startsWith(list.get(i))){
                return false;
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        String[] arr = {"123", "12345", "1245", "1243", "12"};
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
