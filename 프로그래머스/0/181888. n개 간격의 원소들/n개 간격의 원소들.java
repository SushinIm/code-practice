class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[len];
        for (int i = 0, j = 0; j < num_list.length; j += n, i++) {
            answer[i] = num_list[j];
        }
        
        return answer;
    }
}