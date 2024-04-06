class Solution {
    public int solution(String number) {
        return number.chars().map(num -> num - '0').sum() % 9;
    }
}