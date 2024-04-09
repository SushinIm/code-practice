class Solution {
    public String solution(String my_string, int s, int e) {
        char[] chars = my_string.toCharArray();
        
        for (int i = s, j = e; i <= j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        
        return new String(chars);
    }
}