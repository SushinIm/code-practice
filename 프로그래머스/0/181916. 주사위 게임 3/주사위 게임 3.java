import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[] {a, b, c, d};

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return switch(map.size()) {
            case 1 -> Integer.parseInt("" + a + b + c + d);
            case 2 -> {
                if (map.containsValue(3)) {
                    yield map.keySet().stream()
                        .map(key -> map.get(key) == 3 ? key * 10 : key)
                        .reduce((x, y) -> (x + y) * (x + y))
                        .get();
                }
                int x = (a + b + c + d - 2 * a) / 2;
                yield (a + x) * Math.abs(a - x);
            }
            case 3 -> map.keySet().stream()
                .filter(key -> map.get(key) == 1)
                .reduce((x, y) -> x * y)
                .get();
            case 4 -> Math.min(Math.min(arr[0], arr[1]), Math.min(arr[2], arr[3]));
            default -> 0;
        };
    }
}