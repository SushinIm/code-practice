import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int index = 0;
        int[] answer = new int[queries.length];

        for (int[] query : queries) {
            answer[index++] = IntStream.rangeClosed(query[0], query[1])
                       .map(i -> arr[i])
                       .filter(num -> num > query[2])
                       .min()
                       .orElseGet(() -> -1);
        }
        
        return answer;
    }
}