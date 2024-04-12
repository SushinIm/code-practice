import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int currentValue = map.get(calling);
            String temp = players[currentValue - 1];
            players[currentValue - 1] = players[currentValue];
            players[currentValue] = temp;
            
            map.put(calling, currentValue - 1);
            map.put(players[currentValue], currentValue);
        }
        
        return players;
    }
}