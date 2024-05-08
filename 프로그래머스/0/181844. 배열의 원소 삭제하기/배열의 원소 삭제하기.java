class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int index = 0;
        int answerSize = arr.length;
        boolean[] flag = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int del : delete_list) {
                if (arr[i] == del) {
                    flag[i] = true;
                    answerSize--;
                    break;
                }   
            }
        }    
        
        int[] answer = new int[answerSize];
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}