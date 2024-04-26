class Solution {
    public double solution(int[] numbers) {
        double total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
}