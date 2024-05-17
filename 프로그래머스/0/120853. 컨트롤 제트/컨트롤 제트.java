class Solution {
    public int solution(String s) {
        int before = 0;
        int answer = 0;
        for (String num : s.split(" ")) {
            if ("Z".equals(num)) {
                answer -= before;
            } else {
                before = Integer.parseInt(num);
                answer += before;   
            }
        }
        return answer;
    }
}