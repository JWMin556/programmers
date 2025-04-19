import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();  // 반환값을 보관하기 위한 스택배열
        Queue<Integer> queue = new ArrayDeque<Integer>(); // 첫 prices들을 보관하기 위한 큐

        for (int i = 0; i < prices.length; i++) {
            queue.add(prices[i]);
        }

        while (!queue.isEmpty()) {
            int price = queue.poll();
            if (queue.size() == 0) {
                stack.push(0);
            }
            int count = 1;
            Iterator<Integer> iterator = queue.iterator();
            while (iterator.hasNext()) {
                int value = iterator.next();
                if (price > value) {
                    stack.push(count);
                    break;
                }
                if (!iterator.hasNext()) {
                    stack.push(count);
                    break;
                }
                count++;
            }
        }
        answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}