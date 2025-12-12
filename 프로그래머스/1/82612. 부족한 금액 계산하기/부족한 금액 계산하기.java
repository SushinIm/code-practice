import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = money - LongStream.rangeClosed(1, count).map(index -> index * price).sum();

        return Math.max(0, answer * -1);
    }
}