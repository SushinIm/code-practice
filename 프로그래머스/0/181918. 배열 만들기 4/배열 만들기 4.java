import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (stk.size() != 0 && stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
            stk.add(arr[i]);
        }
        
        return stk;
    }
}