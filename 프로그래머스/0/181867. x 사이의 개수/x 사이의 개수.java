class Solution {
    public int[] solution(String myString) {
        String[] splited = myString.split("x", -1);
        int[] answer = new int[splited.length];
        int index = 0;
        for (String str : splited) {
            answer[index++] = str.length();
        }
        return answer;
    }
}