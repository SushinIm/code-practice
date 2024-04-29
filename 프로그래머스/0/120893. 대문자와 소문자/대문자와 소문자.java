class Solution {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            charArray[i] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        
        return new String(charArray);
    }
}