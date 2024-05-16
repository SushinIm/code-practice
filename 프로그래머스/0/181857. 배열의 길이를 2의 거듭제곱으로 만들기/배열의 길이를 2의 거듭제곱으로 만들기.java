import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] pows = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] answer;
        for (int i = 0; i < pows.length; i++) {
            if (arr.length <= pows[i]) {
                return Arrays.copyOfRange(arr, 0, pows[i]);
            }
        }
        return arr;
    }
}