class Solution {
    public String[] solution(String myStr) {
        String answer = String.join(" ", String.join(" ", String.join(" ", myStr.split("a")).split("b")).split("c")).trim();
        
        return answer.length() == 0 ? new String[] { "EMPTY" } : answer.split("\\s+");
    }
}