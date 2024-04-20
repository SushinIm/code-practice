import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf("S") != -1) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }

        for (String route : routes) {
            int[] start = Arrays.copyOf(answer, answer.length);
            String[] movement = route.split(" ");
            boolean flag = true;
            for (int i = 0; i < Integer.parseInt(movement[1]); i++) {
                switch(movement[0]) {
                    case "N" -> start[0]--;
                    case "S" -> start[0]++;
                    case "W" -> start[1]--;
                    case "E" -> start[1]++;
                }

                if ((start[0] < 0 || start[0] >= park.length) ||
                        (start[1] < 0 || start[1] >= park[start[0]].length()) ||
                        park[start[0]].charAt(start[1]) == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer = start;
            }
        }
        
        return answer;
    }
}