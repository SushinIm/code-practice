import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int repeat = flag[i] ? arr[i] * 2 : arr[i];
            for (int j = 0; j < repeat; j++) {
                if (flag[i]) {
                    answer.add(arr[i]);
                } else {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        return answer;
    }
}