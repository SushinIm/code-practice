class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        int length = 0;
        for (int i : arr) {
            length += i;
        }
        
        int[] answer = new int[length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}