class Solution {
    public String[] solution(String[] picture, int repeat) {
        String[] answer = new String[picture.length * repeat];

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : picture[i].toCharArray()) {
                sb.append(String.valueOf(c).repeat(repeat));
            }
            for (int j = 0; j < repeat; j++) {
                answer[i * repeat + j] = sb.toString();
            }
        }
        
        return answer;
    }
}