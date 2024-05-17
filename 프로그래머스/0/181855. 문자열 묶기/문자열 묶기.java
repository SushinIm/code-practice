import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (String str : strArr) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            answer = answer > map.get(key) ? answer : map.get(key);
        }
        return answer;
    }
}