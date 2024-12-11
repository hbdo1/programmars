package lv2;

public class TargetNumber {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        int depth = 0;
        int sum = 0;
        calculate(numbers,depth,target,sum);
        return answer;
    }
    void calculate(int[] numbers,int depth,int target,int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        calculate(numbers, depth + 1, target, sum + numbers[depth]);
        calculate(numbers, depth + 1, target, sum - numbers[depth]);
    }
}
