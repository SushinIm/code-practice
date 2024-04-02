import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        IntStream.range(0, queries.length).forEach(index -> {
            int temp = answer[queries[index][0]];
            answer[queries[index][0]] = answer[queries[index][1]];
            answer[queries[index][1]] = temp;
        });
        
        return answer;
    }
}