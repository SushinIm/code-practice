class Solution {
    public int solution(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]+", " ").trim();
        int answer = 0;
        if (!numbers.isEmpty()) {
            for (String number : numbers.split(" ")) {
                answer += Integer.parseInt(number);
            }   
        }
        return answer;
    }
}