class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i : array) {
            int diff = Math.abs(i - n);
            if (diff < min) {
                min = diff;
                answer = i;   
            } else if (diff == min) {
                answer = answer > i ? i : answer;
            }
        }
        return answer;
    }
}