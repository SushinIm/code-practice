class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                int number = numbers[i] * numbers[j];
                answer = answer > number ? answer : number;
            }
        }
        return answer;
    }
}