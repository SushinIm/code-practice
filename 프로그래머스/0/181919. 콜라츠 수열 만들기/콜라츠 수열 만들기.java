import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 1) {
            list.add(n);
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }
        
        list.add(n);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}