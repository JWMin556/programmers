import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new ArrayDeque<>();  // 각 일별로 며칠 내에 끝낼 수 있는지 큐에 저장
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int remainingTime = 0;
            if ((100 - progress) % speed == 0) {
                remainingTime = (100 - progress) / speed;
            } else {
                remainingTime = ((100 - progress) / speed) + 1;
            }
            queue.add(remainingTime);
        }

        int theBiggestRemaining = queue.isEmpty() ? 0 : queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current > theBiggestRemaining) {
                finalList.add(count);
                theBiggestRemaining = current;
                count = 1;
            } else {
                count++;
            }
        }
        finalList.add(count);
        answer = finalList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}