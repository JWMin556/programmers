import java.util.*;

class Solution {
    private static boolean isPriorityRight(Queue<int[]> q, int n) {
        for (int[] c : q) {
            if (c[0] > n) return true; // 큐 내에 우선순위가 더 큰 숫자가 있다. 
        }
        return false; // 큐 내에 우선순위가 더 큰 숫자가 없다. 
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] { priorities[i], i }); // priority + 원래 index를 함께 저장
        }
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if (isPriorityRight(queue, current[0])) {
                queue.add(current);
            } else {
                answer++;
                if (current[1] == location) break;
            }
        }
        
        return answer;
    }
}