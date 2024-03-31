class Solution {
    public int solution(int a, int b, int c) {
        int abc = a + b + c;
        int aac = abc * (a * a + b * b + c * c);
        int aaa = aac * (a * a * a + b * b * b+ c * c * c);
        
        if (a == b && a == c) {
            return aaa;
        } else if (a != b && a != c && b != c) {
            return abc;
        } else {
            return aac;
        }
    }
}