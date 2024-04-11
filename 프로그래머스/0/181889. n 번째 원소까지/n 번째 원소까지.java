import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        /*
            int[] answer = new int[n - 1];
            //case 1
            for (int i = 0; i < n; i++) {
                answer[i] = num_list[i];
            }
            //case 2
            answer = IntStream.range(0, n).map(i -> answer[i]).toArray();
        */
        
        return Arrays.copyOfRange(num_list, 0, n);
    }
}