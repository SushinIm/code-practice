class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = included[0] ? a : 0;
        
        for (int i = 1; i < included.length; i++) {
            answer += included[i] ? a + d * i : 0;
        }
        
        return answer;
    }
}