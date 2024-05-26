import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int xy = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[xy][xy];
        
        for(int i = 0 ; i < xy; i++) {
            if (i < arr.length) {
                answer[i] = Arrays.copyOfRange(arr[i], 0, xy);
                for (int j = answer[i].length; j < xy; j++) {
                    answer[i][j] = 0;
                }
            } else {
                answer[i] = new int[xy];
            }
        }
        
        return answer;
    }
}