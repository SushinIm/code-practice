import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        return switch (n) {
            case 1 -> Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2 -> Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 -> Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 -> {
                int[] answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                for (int i = 0; slicer[0] <= slicer[1]; slicer[0] += slicer[2], i++) {
                    answer[i] = num_list[slicer[0]];
                }
                yield answer;
            }
            default -> new int[0];
        };
    }
}