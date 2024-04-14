class Solution {
    public String solution(String my_string, int[] indices) {
        char[] chars = my_string.toCharArray();
        char[] answer = new char[my_string.length() - indices.length];
        for (int i : indices) {
            chars[i] -= 32;
        }
        
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (chars[i] < 97) {
                continue;
            }
            answer[j++] = chars[i];
        }
        return new String(answer);
    }
}