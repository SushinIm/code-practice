class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] numbers = my_string.replaceAll("[^0-9]", "").toCharArray();
        for (char number : numbers) {
            answer += number - '0';
        }
        return answer;
    }
}