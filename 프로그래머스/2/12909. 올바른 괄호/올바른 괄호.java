class Solution {
    boolean solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ')' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '(') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        
        return sb.length() == 0;
    }
}