class Solution {
    public String[] solution(String my_str, int n) {
        int myStrLength = my_str.length();
        int arrayLength = myStrLength % n == 0 ? (myStrLength / n) : (myStrLength / n) + 1;
        String[] answer = new String[arrayLength];
        
        for (int i = 0; i < arrayLength; i++) {
            int from = i * n;
            int to = Math.min((from + n), myStrLength);
            answer[i] = my_str.substring(from, to);
        }
        
        return answer;
    }
}