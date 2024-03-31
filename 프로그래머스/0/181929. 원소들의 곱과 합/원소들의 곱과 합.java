import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int mul = IntStream.of(num_list).reduce(1, (n, m) -> n * m);
        int pow = (int) Math.pow(IntStream.of(num_list).sum(), 2);
        
        return mul < pow ? 1 : 0;
    }
}