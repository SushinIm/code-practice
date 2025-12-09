import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
            .map(number -> {
                int count = 0;
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                return count % 2 == 0 ? number : number * -1;
            })
            .sum();
    }
}