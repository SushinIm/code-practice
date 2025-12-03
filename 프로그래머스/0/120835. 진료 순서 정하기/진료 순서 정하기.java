class Solution {
    public int[] solution(int[] emergency) {
        int[] priority = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            priority[i]++;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    priority[i]++;
                }
            }
        }
        
        return priority;
    }
}