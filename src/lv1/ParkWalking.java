package lv1;

public class ParkWalking {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = answer[0];
        int y = answer[1];
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                x = i;
                y = park[i].indexOf("S");
                break;
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String direction = routes[i].split(" ")[0];
            int distance = Integer.valueOf(routes[i].split(" ")[1]);

            int currentX = x;
            int currentY = y;

            for (int j = 0; j < distance; j++) {
                if (direction.equals("E")) {
                    currentX++;
                } else if (direction.equals("W")) {
                    currentX--;
                } else if (direction.equals("S")) {
                    currentY--;
                } else {
                    currentY++;
                }
            }
        }
        return answer;
    }
}
