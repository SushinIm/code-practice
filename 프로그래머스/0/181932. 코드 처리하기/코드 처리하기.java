class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        for (int i = 0; i < code.length(); i++) {
            if (mode) {
                if ('1' == code.charAt(i)) {
                    mode = !mode;
                } else {
                    answer += i % 2 == 1 ? code.charAt(i) : "";
                }
            } else {
                if ('1' == code.charAt(i)) {
                    mode = !mode;
                } else {
                    answer += i % 2 == 0 ? code.charAt(i) : "";
                }
            }
        }
        
        return "".equals(answer) ? "EMPTY" : answer;
    }
}