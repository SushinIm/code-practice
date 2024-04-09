import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int strSize = my_string.length();
        String[] answer = new String[strSize];

        for (int i = 0; i < strSize; i++) {
            answer[i] = my_string.substring(strSize - 1 - i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}