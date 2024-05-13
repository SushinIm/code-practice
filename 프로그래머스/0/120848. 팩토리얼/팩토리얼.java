class Solution {
    public int solution(int n) {
        int i = 1;
        int answer = 1;
        while(i <= n) {
            i *= answer++;
        }
        return answer - 2;
    }
}