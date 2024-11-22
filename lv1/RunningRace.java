package lv1;
import java.util.*;
public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> h1 = new HashMap<String, Integer>();
        for (int i = 0; i < players.length; i++) {
            h1.put(players[i],i);
        }
        for (int i = 0; i < callings.length; i++) {
            int ranking = h1.get(callings[i]);

            String beforePlayer = players[ranking - 1];

            h1.replace(beforePlayer,ranking);
            h1.replace(callings[i],ranking - 1);

            players[ranking] = beforePlayer;
            players[ranking - 1] = callings[i];

        }
        return players;
    }
}
