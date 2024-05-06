class Solution {
    public int[] solution(String my_string) {
        return my_string.chars()
            .filter(c -> c < 65)
            .map(c -> c - '0')
            .sorted()
            .toArray();
    }
}