class Solution {
    public String solution(String myString) {
        char[] chars = myString.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] == 'a' ? 'A' : chars[i];
        }
        return new String(chars);
    }
}