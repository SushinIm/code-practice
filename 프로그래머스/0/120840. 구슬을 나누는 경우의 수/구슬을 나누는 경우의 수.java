class Solution {
    public int solution(int balls, int share) { 
        Long answer = 1L;

        for(int i = 0; i < share; i++){
            answer *= balls - i;
            answer /= i + 1;
        }        
        
        return answer.intValue();
    }
}