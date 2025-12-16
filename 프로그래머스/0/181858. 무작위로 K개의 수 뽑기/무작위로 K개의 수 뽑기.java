import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        boolean[] isExists = new boolean[100000];
        int[] answer = new int[k];
        int answerIndex = 0;

        Arrays.fill(answer, -1);

        for (int j : arr) {
            if (answerIndex == k) break;
            if (isExists[j]) continue;

            isExists[j] = true;
            answer[answerIndex++] = j;
        }
        
        return answer;
    }
}