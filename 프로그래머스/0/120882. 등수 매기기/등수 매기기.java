import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            double average = (double) (score[i][0] + score[i][1]) / 2;
            map.put(i + 1, average);
        }
        map = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {throw new AssertionError();},
                        LinkedHashMap::new
                ));
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        Iterator iterator = map.entrySet().iterator();
        double previousValue = 0;
        boolean duplicate = false;
        int rankIndex = 0;
        for (int i = 0; i < score.length; i++) {
            if (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (i > 0 && previousValue == (Double) entry.getValue()) {
                    if (!duplicate) {
                        duplicate = true;
                        rankIndex = i;
                    }
                } else {
                    duplicate = false;
                    rankIndex = i + 1;
                }
                rankMap.put((Integer) entry.getKey(), rankIndex);
                previousValue = (Double) entry.getValue();
            }
        }
        answer = rankMap.values().stream().mapToInt(i -> i).toArray();
        return answer;
    }
}