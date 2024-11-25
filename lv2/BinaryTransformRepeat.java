package lv2;

public class BinaryTransformRepeat {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int zeroCount = 0;
        int binaryCount = 0;
        while (!s.equals("1")) {
            while (s.contains("0")) {
                s = s.replaceFirst("0", "");
                zeroCount++;
            }
            int binary = s.length();
            StringBuilder sb = new StringBuilder();
            while (binary > 0) {
                sb.append(binary % 2);
                binary /= 2;
            }
            binaryCount++;
            s = sb.reverse().toString();
        }
        answer[0] = binaryCount;
        answer[1] = zeroCount;
        return answer;
    }
}
