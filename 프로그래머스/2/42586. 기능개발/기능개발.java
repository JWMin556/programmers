import java.util.*;

class Solution {
    private static int divide(int x, int y) {
        return (x % y == 0) ? (x / y) : (x / y) + 1;
    }
    
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingProgresses = 100 - progresses[i];
            int remainingValue = divide(remainingProgresses, speeds[i]);
            queue.add(remainingValue);
        }
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }
            answerList.add(count);
        }
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}