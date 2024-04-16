class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";
        for (int i = 0; i < finished.length; i++) {
            if (finished[i]) {
                continue;
            }
            answer += todo_list[i] + ",";
        }
        
        return answer.split(",");
    }
}