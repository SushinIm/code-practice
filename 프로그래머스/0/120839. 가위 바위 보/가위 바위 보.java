class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (char c : rsp.toCharArray()) {
            answer.append(switch(c + "") {
                case "2" -> "0";
                case "0" -> "5";
                case "5" -> "2";
                default -> "";
            });
        }
        return answer.toString();
    }
}