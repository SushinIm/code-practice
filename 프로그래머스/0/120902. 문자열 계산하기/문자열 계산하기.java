class Solution {
    public int solution(String my_string) {
        String[] splited = my_string.split(" ");
        int answer = Integer.parseInt(splited[0]);
        for (int i = 1; i < splited.length; i += 2) {
            answer = switch (splited[i]) {
                case "+" -> answer + Integer.parseInt(splited[i + 1]);
                case "-" -> answer - Integer.parseInt(splited[i + 1]);
                default -> answer;
            };
        }
        return answer;
    }
}