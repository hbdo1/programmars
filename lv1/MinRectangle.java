package lv1;

public class MinRectangle {
    public int solution(int[][] sizes) {

        int widthMax = 0;
        int heightMax = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (widthMax < sizes[i][0]) {
                widthMax = sizes[i][0];
            }
            if (heightMax < sizes[i][1]) {
                heightMax = sizes[i][1];
            }
        }
        int answer = widthMax * heightMax;
        return answer;
    }
}
