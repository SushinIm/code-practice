class Solution {
    public int[][] solution(int[] num_list, int n) {
        int index = num_list.length / n;
        int num_index = 0;
        int[][] answer = new int[index][n];
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[num_index++];
            }
        }
        return answer;
    }
}