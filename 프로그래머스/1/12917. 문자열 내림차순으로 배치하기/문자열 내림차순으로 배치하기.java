class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().sorted().forEach(c -> sb.append((char) c));
        return sb.reverse().toString();
    }
}