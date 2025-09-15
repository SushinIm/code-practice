class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : arr) {
            int number = Integer.parseInt(str);
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        
        return min + " " + max;
    }
}