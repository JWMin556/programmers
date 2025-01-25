import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], Math.abs(array[i] - n));
        }
        map = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue() //먼저 value로 sort하고
                       .thenComparing(Map.Entry.comparingByKey())) //그 후 value가 같으면, key로 비교
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {throw new AssertionError();},
                        LinkedHashMap::new
                ));
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            Map.Entry<Integer, Integer> firstEntry = iterator.next();
            answer = firstEntry.getKey();
        }
        return answer;
    }
}