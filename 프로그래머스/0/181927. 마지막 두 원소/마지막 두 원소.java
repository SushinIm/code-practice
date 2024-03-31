import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int lastNum = num_list[num_list.length - 1];
        int backNum = num_list[num_list.length - 2];

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length - 1] = lastNum > backNum ? lastNum - backNum : lastNum * 2;
        
        return answer;
    }
}