package lv2;

public class NextBigNum {
    public int solution(int n) {

        int nCount = Integer.bitCount(n);

        while (true) {
            n++;
            int n2Count = Integer.bitCount(n);

            if (nCount == n2Count) {
                return n;
            }
        }
    }
}
