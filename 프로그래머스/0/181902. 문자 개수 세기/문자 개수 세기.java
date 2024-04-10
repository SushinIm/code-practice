class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()) {
            int index = c - 97 < 0 ? c - 65 : c - 71;
            answer[index]++;
        }
        return answer;
    }
}