package lv1;


import java.util.Stack;

public class CrainDoll {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            move -= 1;

            for (int i = 0; i < board.length; i++) {
                if (board[i][move] != 0 ) {
                    if (!stack.isEmpty() && stack.peek() == board[i][move]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move]);
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
