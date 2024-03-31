class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int before = numLog[0];
        
        for (int i = 1; i < numLog.length; i++) {
            switch(numLog[i] - before) {
                case 1 -> sb.append("w");
                case -1 -> sb.append("s");
                case 10 -> sb.append("d");
                case -10 -> sb.append("a");
                default -> sb.append("x");
            } 
            before = numLog[i];
        }
        
        return sb.toString();
    }
}