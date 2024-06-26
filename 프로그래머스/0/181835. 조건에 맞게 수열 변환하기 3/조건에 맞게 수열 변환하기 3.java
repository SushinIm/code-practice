import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }
}