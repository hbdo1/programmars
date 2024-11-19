package lv1;

import java.util.*;

public class Phoneketmon {
    public int solution(int[] nums) {

        int selectNum = nums.length / 2;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        // selectNum 이 list.size() 보다 작은 경우 selectNum 출력
        // selectNum 이 list.size() 보다 큰 경우 list.size() 출력
        // 같으면 selectNum 출력
        if (selectNum < list.size()) {
            return selectNum;
        } else if (selectNum > list.size()) {
            return list.size();
        } else {
            return selectNum;
        }
    }
}
