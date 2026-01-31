import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        // clothes에 있는 모든 옷들을 Map에 넣기
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            int count = map.getOrDefault(key, 0);
            map.put(key, count + 1);
        }
        
        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);  // '안입음' 이라는 경우를 1이라고 해서 더함
        }
        
        return answer - 1; // 아무것도 안입음이라는 경우를 제외하고자 1을 뺌
    }
}