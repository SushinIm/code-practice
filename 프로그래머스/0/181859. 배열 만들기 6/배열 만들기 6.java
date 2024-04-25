import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int top = -1;
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (size == 0) {
                size++;
                arr[++top] = arr[i];
            } else {
                if (arr[top] != arr[i]) {
                    size++;
                    arr[++top] = arr[i];
                } else {
                    size--;
                    top--;
                }
            }
        }
        
        return top < 0 ? new int[] {-1} : Arrays.copyOf(arr, top + 1);
    }
}