import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r)
            .filter(num -> {
                while (num > 0) {
                    int n = num % 10;
                    if (n != 0 && n != 5) {
                        return false;
                    }
                    num /= 10;
                }
                return true;
            }).toArray();
        
        return answer.length > 0 ? answer : new int[] {-1};
    }
}