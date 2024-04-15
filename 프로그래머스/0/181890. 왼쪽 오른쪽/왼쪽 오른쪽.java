class Solution {
    public String[] solution(String[] str_list) {
        String[] answer;
        String str = String.join("", str_list);
        int lIndex = str.indexOf("l");
        int rIndex = str.indexOf("r");

        if (str.contains("l") && str.contains("r")) {
            if (lIndex < rIndex) {
                answer = new String[lIndex];
                for (int i = 0; i < lIndex; i++) {
                    answer[i] = str_list[i];
                }
            } else {
                answer = new String[str.length() - (rIndex + 1)];
                for (int i = 0; i < str.length() - (rIndex + 1); i++) {
                    answer[i] = str_list[(rIndex + 1) + i];
                }
            }
        } else if (str.contains("l") && !str.contains("r")) {
            answer = new String[lIndex];
            for (int i = 0; i < lIndex; i++) {
                answer[i] = str_list[i];
            }
        } else if (!str.contains("l") && str.contains("r")){
            answer = new String[str.length() - (rIndex + 1)];
            for (int i = 0; i < str.length() - (rIndex + 1); i++) {
                answer[i] = str_list[(rIndex + 1) + i];
            }
        } else {
            answer = new String[] {};
        }
        
        return answer;
    }
}