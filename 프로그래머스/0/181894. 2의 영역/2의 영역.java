class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start < 0) {
                    start = i;
                }
                end = i;
            }
        }
        
        if (start == -1) {
            return new int[] { -1 };
        } else {
            int[] answer = new int[end - start + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[start++];
            }

            return answer;   
        }
    }
}