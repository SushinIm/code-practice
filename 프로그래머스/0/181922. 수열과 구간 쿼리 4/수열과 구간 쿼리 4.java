import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int[] query : queries) {
            IntStream.rangeClosed(query[0], query[1])
                .filter(i -> i % query[2] == 0)
                .forEach(i -> answer[i] += 1);
        }
        
        return answer;
    }
}