import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < numlist.length; i++) {
            map.put(numlist[i], Math.abs(numlist[i] - n));
        }
        map = map.entrySet().stream()
                .sorted(
                        Map.Entry.<Integer, Integer>comparingByValue()
                                .thenComparing(
                                        Comparator.<Map.Entry<Integer, Integer>, Integer>comparing(Map.Entry::getKey)
                                                .reversed()
                                )
                )
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        answer = map.keySet().stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}