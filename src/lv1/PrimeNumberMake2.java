package lv1;

public class PrimeNumberMake2 {
    public int solution(int[] nums) {
        int answer = 0; // [0,1,2,3] 0,1,2 0,1,3 1,2,3
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    boolean prime = true;
                    int sum = nums[i] + nums[j] + nums[k];
                    for (int l = 2; l <= (int)Math.sqrt(sum); l++) { // 2, 3일 때 실행안됨
                        if (sum % l == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime == true) {
                        answer++;
                    }
                }
            }
        }
    return answer;
    }
}

