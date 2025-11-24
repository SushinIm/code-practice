class Solution
{
    public int solution(int n, int a, int b) {
        int round = 1;
        a--;
        b--;

        while ((a /= 2) != (b /= 2)) round++;

        return round;
    }
}