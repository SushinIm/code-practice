import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
        
        /*
            스택 안쓰는 풀이
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
        */
    }
}