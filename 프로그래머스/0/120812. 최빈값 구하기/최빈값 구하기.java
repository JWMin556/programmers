import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = Arrays.stream(array).sorted().toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        map.put(arr[0], count);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                map.put(arr[i], count);
            } else {
                count = 1;
                map.put(arr[i], count);
            }
        }

        Iterator<Integer> iterator = map.keySet().iterator();

        int i = 1;
        int number = 0;
        boolean flag = false;
        while (iterator.hasNext()) {
            if (i == 1) {
                int key = iterator.next();
                number = map.get(key);
                answer = key;
                i++;
            } else {
                int key = iterator.next();
                if (number < map.get(key)) {
                    flag = false;
                    number = map.get(key);
                    answer = key;
                } else if (number == map.get(key)) {
                    flag = true;
                }
            }
        }
        if (flag) { answer = -1; }
        return answer;
    }
}