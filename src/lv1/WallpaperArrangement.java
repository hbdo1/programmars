package lv1;

public class WallpaperArrangement {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int[] startPoint = {wallpaper.length, wallpaper[0].length()};
        int[] finishPoint = {0, 0};

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                if (startPoint[0] > i) {
                    startPoint[0] = i;
                }
                if (startPoint[1] > wallpaper[i].indexOf("#")) {
                    startPoint[1] = wallpaper[i].indexOf("#");
                }
                if (finishPoint[0] < i + 1) {
                    finishPoint[0] = i + 1;
                }
                if (finishPoint[1] < wallpaper[i].lastIndexOf("#") + 1) {
                    finishPoint[1] = wallpaper[i].lastIndexOf("#") + 1;
                }

            }
        }
        answer[0] = startPoint[0];
        answer[1] = startPoint[1];
        answer[2] = finishPoint[0];
        answer[3] = finishPoint[1];
        return answer;
    }
}
