class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = { 0, 0 };
        for (String key : keyinput) {
            switch (key) {
                case "left" : 
                    if (Math.abs(board[0] / 2) >= Math.abs(answer[0] - 1)) {
                      answer[0]--;   
                    } 
                    break;
                case "right": 
                    if (Math.abs(board[0] / 2) >= Math.abs(answer[0] + 1)) {
                      answer[0]++;   
                    }
                    break;
                case "up"   : 
                    if (Math.abs(board[1] / 2) >= Math.abs(answer[1] + 1)) {
                      answer[1]++;   
                    } 
                    break;
                case "down" : 
                    if (Math.abs(board[1] / 2) >= Math.abs(answer[1] - 1)) {
                      answer[1]--;   
                    } 
                    break;
                default     : break;
            }
        }
        return answer;
    }
}