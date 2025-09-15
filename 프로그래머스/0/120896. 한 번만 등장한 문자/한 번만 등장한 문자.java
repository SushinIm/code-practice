import java.util.*;

class Solution {
    public String solution(String s) {
        int[] exist = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            exist[s.charAt(i) - 'a']++;
        }


        for (int i = 0; i < exist.length; i++) {
            if (exist[i] == 1) {
                sb.append((char)('a' + i));
            }
        }

        return sb.toString();
    }
}