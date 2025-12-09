import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers)
            .filter(number -> number != Arrays.stream(numbers).min().getAsInt())
            .toArray();
        
        return answer.length == 0 ? new int[] { -1 } : answer;
    }
}