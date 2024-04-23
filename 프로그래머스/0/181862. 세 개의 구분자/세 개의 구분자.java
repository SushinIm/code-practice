class Solution {
    public String[] solution(String myStr) {
        String answer = myStr.replaceAll("a|b|c", " ").trim();
        
        return answer.length() == 0 ? new String[] { "EMPTY" } : answer.split("\\s+");
    }
}