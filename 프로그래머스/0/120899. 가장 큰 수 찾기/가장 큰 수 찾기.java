import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2]; // 0번째에는 숫자가, 1번째에는 index가
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }
        map = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a , b) -> {throw  new AssertionError();},
                        LinkedHashMap::new
                ));
        Iterator<Integer> iterator = map.keySet().iterator();
        if (iterator.hasNext()) {
            answer[1] = iterator.next();
            answer[0] = map.get(answer[1]);
        }
        return answer;
    }
}