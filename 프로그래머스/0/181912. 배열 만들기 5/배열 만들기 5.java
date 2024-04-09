import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
            .mapToInt(intStr -> Integer.parseInt(intStr.substring(s, s + l)))
            .filter(intStr -> intStr > k)
            .toArray();
    }
}