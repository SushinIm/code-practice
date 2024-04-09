class Solution {
    public String[] solution(String my_string) {
        int strSize = my_string.length();
        String[] answer = new String[strSize];

        for (int i = 0; i < strSize; i++) {
            answer[i] = my_string.substring(strSize - 1 - i);
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < i; j++) {
                if (answer[i].compareTo(answer[j]) < 0) {
                    String temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}