class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        for (int[] query : queries) {
            for (int i = query[0], j = query[1]; i < j; i++, j--) {
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
            }
        }
        return new String(chars);
    }
}